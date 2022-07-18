package com.murilorb.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.murilorb.workshopmongo.domains.User;

public interface UserRepository extends MongoRepository<User, String> {

}
