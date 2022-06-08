package com.example.SinauKodingSalwa.controller;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.entity.Pinjam;
import com.example.SinauKodingSalwa.repository.PinjamRepository;
import com.example.SinauKodingSalwa.response.Response;
import com.example.SinauKodingSalwa.service.BukuService;
import com.example.SinauKodingSalwa.service.PinjamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/buku")
public class PinjamController {
    @Autowired
    PinjamService pinjamService;


    @Autowired
    PinjamRepository pinjamRepository;

    // create
    public Pinjam createPinjam(Pinjam param) {
        return pinjamRepository.save(param);
    }

    public List<Pinjam> findAll() {
        return pinjamRepository.findAll();
    }

    // find by id
    public Pinjam findById(Integer id){
        return pinjamRepository.findById(id).get();
    }

    //Update
    public Pinjam updatePinjamById(Pinjam pinjam, int id){
        Pinjam reference = pinjamRepository.findById(id).get();
        reference.setAnggota(pinjam.getAnggota()!=null?pinjam.getAnggota():reference.getAnggota());
        reference.setBuku(pinjam.getBuku()!=null?pinjam.getBuku():reference.getBuku());
        reference.setTglPinjam(pinjam.getTglPinjam()!=null?pinjam.getTglPinjam():reference.getTglPinjam());
        reference.setTglKembali(pinjam.getTglKembali()!=null?pinjam.getTglKembali():reference.getTglKembali());
        return pinjamRepository.save(reference);
    }

    //Delete
    public Boolean deletePinjamById(int id){
        Pinjam reference = pinjamRepository.findById(id).orElse(null);
        if(reference != null){
            pinjamRepository.delete(reference);
            return true;
        }else{
            return false;
        }
    }
}