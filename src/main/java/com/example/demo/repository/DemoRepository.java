package com.example.demo.repository;

import com.example.demo.model.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chappidi srinath
 * @since 24-05-2021
 */
@Repository
public interface DemoRepository extends MongoRepository<Demo, String> {
}
