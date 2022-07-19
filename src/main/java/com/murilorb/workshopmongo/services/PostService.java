package com.murilorb.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilorb.workshopmongo.domains.Post;
import com.murilorb.workshopmongo.repositories.PostRepository;
import com.murilorb.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

}
