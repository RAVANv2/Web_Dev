package com.harsh.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class restfulAPI {

    @GetMapping("/aliens")
    @ResponseBody
    // ResponseBody is use to send response because by default they return jsp
    public String numbers(){
        List<Alien> AList = new ArrayList<Alien>();
        AList.add(new Alien(1234, "Harsh"));
        AList.add(new Alien(12345,"Hitesh"));
        System.out.println(AList);
        return AList.toString();
    }

    @GetMapping("/family")
    public HashMap<Integer, String> address(){
        HashMap<Integer, String> add = new HashMap<Integer, String>();
        add.put(1,"Harsh");
        add.put(2,"Hitesh");
        add.put(3,"Lalita");
        add.put(4,"Sukhbir");
        return add;
    }

    @GetMapping("alien/{id}")
    public HashMap<Integer, String> getById(@PathVariable("id") int id){
        HashMap<Integer,String> hash = new HashMap<Integer,String>();
        hash.put(id,"Harsh");
        return hash;
    }
}
