package com.example.SinauKodingSalwa.service;
import com.example.SinauKodingSalwa.entity.Pinjam;
import com.example.SinauKodingSalwa.repository.AnggotaRepository;
import com.example.SinauKodingSalwa.repository.BukuRepository;
import com.example.SinauKodingSalwa.repository.PinjamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PinjamService {
    @Autowired
    PinjamRepository pinjamRepository;

    @Autowired
    AnggotaRepository anggotaRepository;

    @Autowired
    BukuRepository bukuRepository;

    //Create
    public Pinjam createPinjam(Pinjam param){
        return pinjamRepository.save(param);

    }

    //Read
    public List<Pinjam> selectAllPinjam(){
        return pinjamRepository.findAll();
    }
    public Optional<Pinjam> selectPinjamById(Integer id) {
        return pinjamRepository.findById(id);
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