package com.mongo.repositories;

import com.mongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByCity(String city);
    public List<User> findByDesignation(String designation);
}
