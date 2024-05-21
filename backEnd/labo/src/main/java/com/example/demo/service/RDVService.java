package com.example.demo.service;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.model.RDV;
import com.example.demo.model.User;
import com.example.demo.repo.RDVRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class RDVService {
    private final RDVRepo rdvRepo;

    @Autowired
    public RDVService(RDVRepo rdvRepo) {
        this.rdvRepo = rdvRepo;
    }

    public RDV addRDV(RDV rdv) {

        return rdvRepo.save(rdv);
    }

    public List<RDV> findAllRDV() {
        return rdvRepo.findAll();
    }

    public RDV updateRDV(RDV rdv) {
        return rdvRepo.save(rdv);
    }




    public void deleteRDV(String name) {
    }


    public List<RDV> findRDVByEmail(String email) {
        return rdvRepo.findRDVByEmail(email);
    }
}

