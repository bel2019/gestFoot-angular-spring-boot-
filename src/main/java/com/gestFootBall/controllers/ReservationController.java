package com.gestFootBall.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestFootBall.models.Reservation;
import com.gestFootBall.repository.ReservationRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReservationController {
	@Autowired
	ReservationRepository repository;

@PostMapping("/reservation")
	public Reservation  saveReservation(@Valid @RequestBody Reservation reservation) {
		return repository.save(reservation);
		}
@GetMapping("/reservation")
public List<Reservation> getAllReservation() {
 System.out.println("Get all reservation...");
  List<Reservation> Reservation = new ArrayList<>();
 repository.findAll().forEach(Reservation::add);
 return Reservation;
		}
	
	


}
