package com.course.controller;
import com.course.model.YoutubeCourse;
import com.course.repositories.RepoYoutubeCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class controller {
    @Autowired
    RepoYoutubeCourse youtube;

    @GetMapping("/course")
    public ResponseEntity<List<YoutubeCourse>> getCourse(){
        try {
            List<YoutubeCourse> course = new ArrayList<>();
            course = (List<YoutubeCourse>) youtube.findAll();
            return ResponseEntity.of(Optional.of(course));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/add-course")
    public ResponseEntity<YoutubeCourse> addCourse(@RequestBody YoutubeCourse course){
        try{
            System.out.println(course);
            youtube.save(course);
            return ResponseEntity.of(Optional.of(course));
        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/delete-course/{id}")
    public void removeCourse(@PathVariable("id") Integer id){
    try{
        youtube.deleteById(id);
        return;
    }catch (Exception e){
        e.printStackTrace();
    }
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<YoutubeCourse> updateCourse(@PathVariable("id") Integer id,
                                                      @RequestBody YoutubeCourse course){
        try {
            Optional<YoutubeCourse> cou = youtube.findById(id);
            YoutubeCourse updateCou = cou.get();
            updateCou.setDescription(course.getDescription());
            updateCou.setTitle(course.getTitle());
            updateCou.setId(course.getId());
            youtube.save(updateCou);
            System.out.println(updateCou);
            return ResponseEntity.of(Optional.of(updateCou));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
