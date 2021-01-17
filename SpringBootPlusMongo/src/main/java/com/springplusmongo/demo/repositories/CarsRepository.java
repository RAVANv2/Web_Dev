package com.springplusmongo.demo.repositories;

import com.springplusmongo.demo.models.Cars;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends MongoRepository<Cars,String> {

}
