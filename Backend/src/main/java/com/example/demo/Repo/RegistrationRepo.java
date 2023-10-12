package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.RegistrationDetails;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationDetails,Integer> {

}
