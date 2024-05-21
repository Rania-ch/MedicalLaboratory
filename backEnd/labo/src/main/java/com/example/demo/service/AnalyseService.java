package com.example.demo.service;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.model.Analyse;

import com.example.demo.repo.AnalyseRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class AnalyseService {
    private final AnalyseRepo analyseRepo;

    @Autowired
    public AnalyseService(AnalyseRepo analyseRepo) {
        this.analyseRepo = analyseRepo;
    }

    public Analyse addAnalyse(Analyse analyse) {

        return analyseRepo.save(analyse);
    }

    public List<Analyse> findAllAnalyses() {
        return analyseRepo.findAll();
    }

    public Analyse updateAnalyse(Analyse analyse) {
        return analyseRepo.save(analyse);
    }



    public void deleteAnalyse(Long id) {
        analyseRepo.deleteAnalyseById(id);

    }

    public Analyse findAnalyseById(Long id) {
        return
                analyseRepo.findAnalyseById(id).orElseThrow(() -> new UserNotFoundException("analyse not found"));
    }
    public void deleteAnalyse(String name) {
        analyseRepo.deleteAnalyseByName(name);
}}
