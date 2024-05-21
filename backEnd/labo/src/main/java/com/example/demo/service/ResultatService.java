package com.example.demo.service;

import com.example.demo.model.Resultat;
import com.example.demo.repo.ResultatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.stream.Stream;

@Service
public class ResultatService {
    private final ResultatRepo resultatRepo;
    @Autowired
    public ResultatService(ResultatRepo resultatRepo) {
        this.resultatRepo = resultatRepo;
    }
    public Resultat store(MultipartFile file,String email) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        Resultat FileDB = new Resultat(fileName, file.getContentType(), file.getBytes(),email);

        return resultatRepo.save(FileDB);
    }

    public Resultat getFile(String id) {
        return resultatRepo.findById(id).get();
    }

    public Stream<Resultat> getAllFiles() {
        return resultatRepo.findAll().stream();
    }}