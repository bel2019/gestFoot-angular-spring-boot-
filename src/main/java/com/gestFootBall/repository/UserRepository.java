package com.gestFootBall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestFootBall.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
