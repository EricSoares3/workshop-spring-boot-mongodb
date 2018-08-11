package com.ericsoares.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericsoares.workshopmongo.domain.Post;
import com.ericsoares.workshopmongo.repository.PostRepository;
import com.ericsoares.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) { 
		Optional<Post> obj = repo.findById(id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
		}

	
	
	
	
}
