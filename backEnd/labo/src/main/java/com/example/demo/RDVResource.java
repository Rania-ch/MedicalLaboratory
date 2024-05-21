package com.example.demo;
import com.example.demo.model.RDV;
import com.example.demo.service.RDVService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/rdv")
public class RDVResource {
    private  final RDVService rdvService;
    public RDVResource(RDVService rdvService) {
        this.rdvService = rdvService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<RDV>> getAllRDV(){
        List<RDV>  rdvs= rdvService.findAllRDV();
        return new ResponseEntity<>(rdvs, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<RDV> addRDV(@RequestBody RDV rdv){
        RDV newRdv= rdvService.addRDV(rdv);
        return new ResponseEntity<>(newRdv, HttpStatus.CREATED);
    }
    @GetMapping("/find/all/{email}")
    public ResponseEntity<List<RDV>> getRDV(@PathVariable("email") String email){
        List<RDV>  rdvs= rdvService.findRDVByEmail(email);
        return new ResponseEntity<>(rdvs, HttpStatus.OK);
    }

}
