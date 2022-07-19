package com.murilorb.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.murilorb.workshopmongo.domains.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
