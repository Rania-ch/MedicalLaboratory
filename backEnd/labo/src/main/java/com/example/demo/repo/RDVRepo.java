package com.example.demo.repo;
import com.example.demo.model.RDV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RDVRepo extends JpaRepository<RDV,Long> {
    void deleteRDVById(Long id);


    Optional<RDV> findRDVById(Long id);


    List<RDV> findRDVByEmail(String email);
}

