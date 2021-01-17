package com.springplusmongo.demo.controllers;

import com.springplusmongo.demo.models.Cars;
import com.springplusmongo.demo.repositories.CarsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cars")
public class CarsControllers {

    @Autowired
    private CarsRepository repository;

    @GetMapping("/")
    public List<Cars> getAllCars(){
        return repository.findAll();
    }

//    @GetMapping("/{id}")
//    public Cars getCarByID(@PathVariable("id") String id){
//        return repository.findOne(id);
//    }

    @PutMapping("/{id}")
    public void updateCarById(@PathVariable("id") ObjectId id,@RequestBody Cars car){
        car.setId(id.toString());
        repository.save(car);
    }

    @PostMapping("/{id}")
    public Cars addNewCar(@RequestBody Cars car){
        repository.save(car);
        return car;
    }

//    @DeleteMapping("/{id}")
//    public void deleteCarById(@PathVariable("id") String id){
//        repository.delete(repository.findOne(id));
//    }
}
