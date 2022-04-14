package com.gestFootBall.controllers;

import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestFootBall.models.User;
import com.gestFootBall.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class UserController {
	@Autowired
	UserRepository repository;	
	
	
//methode get pour afficher tout les utilisateurs
@GetMapping("/users")
public List<User> getAllUtilisateur() {
 System.out.println("Get all Utilisateur...");
  List<User> User = new ArrayList<>();
 repository.findAll().forEach(User::add);
 return User;
		}

// methode register
@PostMapping("/users")
public User createUtilisateur(@Valid @RequestBody User User) {
	//this.repository = repository;
	return repository.save(User);
	}


		  
//methode post pour login
	@PostMapping("/login")
		public ResponseEntity<?> loginUser( @RequestBody User dataUser) {
		User user=repository.findByEmail(dataUser.getEmail());
		if(user.getMotDePasse().equals(dataUser.getMotDePasse()))
			return ResponseEntity.ok(user);		
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}		
}
