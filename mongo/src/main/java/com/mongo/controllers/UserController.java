package com.mongo.controllers;

import com.mongo.models.User;
import com.mongo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserRepo user;

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public List<User> getAllUser(){
        System.out.println("Get all user");
        return (List<User>) user.findAll();
    }

    @PostMapping(value = "/post")
    public ResponseEntity<User> addUser(@RequestBody User user1){
        System.out.println("New Entry in DB");
        try{
            user.save(user1);
            return ResponseEntity.of(Optional.of(user1));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user1){
        user1.setId(id);
        user.save(user1);
        return user1;
    }

//    FindbyId and some custom operation is used
    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public User changeCity(@RequestParam("id") Integer id, @RequestParam("designation") String designation
                                ,@RequestParam("cityName") String name){
        Optional<User> dataOptional = user.findById(id);
        User data = dataOptional.get();
        data.setCity(name);
        System.out.println(data);
        user.save(data);
        List<User> des = user.findByDesignation(designation);
        System.out.println(des);
        return data;
//        userData.forEach(userObj -> {
//            if(userObj.getId() == id){
//                userObj.setCity(name);
//                user.save(userObj);
//            }
//        });
    }

}
