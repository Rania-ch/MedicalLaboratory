package com.example.demo.repo;

import com.example.demo.model.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ResultatRepo extends JpaRepository<Resultat, String> {



}
