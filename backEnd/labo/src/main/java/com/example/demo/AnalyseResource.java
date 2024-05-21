package com.example.demo;
import com.example.demo.model.Analyse;
import com.example.demo.service.AnalyseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/analyse")

public class AnalyseResource {
    private  final AnalyseService analyseService;



    public AnalyseResource(AnalyseService analyseService) {
        this.analyseService = analyseService;

    }

    @GetMapping("/all")
    public ResponseEntity<List<Analyse>> getAllAnalyses(){
        List<Analyse> analyses= analyseService.findAllAnalyses();
        return new ResponseEntity<>(analyses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Analyse> getAnalyseById(@PathVariable("id") Long id){
        Analyse analyse= analyseService.findAnalyseById(id);
        return new ResponseEntity<>(analyse, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Analyse> addPatient(@RequestBody Analyse analyse){
        Analyse newAnalyse= analyseService.addAnalyse(analyse);
        return new ResponseEntity<>(newAnalyse, HttpStatus.CREATED);
    }
    //@Secured(value={"ROLE_AGENT","ROLE_PATIENT"})
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/update")
    public ResponseEntity<Analyse> updateAnalyse(@RequestBody Analyse analyse){
        Analyse UpdateAnalyse= analyseService.updateAnalyse(analyse);
        return new ResponseEntity<>(UpdateAnalyse, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<?> deleteAnalyse(@PathVariable("name") String name){
        analyseService.deleteAnalyse(name);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
