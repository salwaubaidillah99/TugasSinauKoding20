package com.example.SinauKodingSalwa.service;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.entity.Pinjam;
import com.example.SinauKodingSalwa.repository.BukuRepository;
import com.example.SinauKodingSalwa.repository.PinjamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PinjamService {
    @Autowired
    PinjamRepository pinjamRepository;

    //Create
    public Pinjam createPinjam(Pinjam pinjam){
        return pinjamRepository.save(pinjam);
    }

    //Read
    public List<Pinjam> findAllPinjam(){
        return pinjamRepository.findAll();
    }

    public List<Pinjam> findByJudulContainingAndPenulisContaining(String judul, String penulis){
        return pinjamRepository.findByJudulContainingAndPenulisContaining(judul, penulis);
    }

    //Update
    public Pinjam updatePinjamById(Pinjam pinjam, int id){
        Pinjam reference = pinjamRepository.findById(id).get();
        reference.setAnggota(pinjam.getAnggota()!=null?pinjam.getAnggota():reference.getAnggota());
        reference.setBuku(pinjam.getBuku()!=null?pinjam.getBuku():reference.getBuku());
        reference.setTglPinjam(pinjam.getTglPinjam()!=null?pinjam.getTglPinjam():reference.getTglPinjam());
        reference.setTglKembali(pinjam.getTglKembali()!=null?pinjam.getTglKembali():reference.getTglPinjam());

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


