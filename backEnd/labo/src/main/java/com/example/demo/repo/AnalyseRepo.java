package com.example.demo.repo;

import com.example.demo.model.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AnalyseRepo extends JpaRepository <Analyse,Long> {


    void deleteAnalyseById(Long id);



    Optional<Analyse> findAnalyseById(Long id);
    @Modifying
    @Query("delete from Analyse where Name=?1")
    void deleteAnalyseByName(String Name);


}
