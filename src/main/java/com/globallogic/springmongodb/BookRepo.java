package com.globallogic.springmongodb;

// Java Program to Illustrate BookRepo File

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
