package com.mongo.controllers;

import com.mongo.models.User;
import com.mongo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public User addUser(@RequestBody User user1){
        System.out.println("New Entry in DB");
        user.save(user1);
        return user1;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user1){
        user1.setId(id);
        user.save(user1);
        return user1;
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public User changeCity(@RequestParam("id") Integer id ,@RequestParam("cityName") String name){
        List<User> userData = (List<User>) user.findAll();
        User updateUser = new User();
        for(User obj : userData){
            if(obj.getId() == id){
                obj.setCity(name);
                user.save(obj);
                updateUser = obj;
                break;
            }
        }
        return updateUser;
//        userData.forEach(userObj -> {
//            if(userObj.getId() == id){
//                userObj.setCity(name);
//                user.save(userObj);
//            }
//        });
    }

}
