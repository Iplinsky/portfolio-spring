package com.iplinsky.courseExercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iplinsky.courseExercise.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
