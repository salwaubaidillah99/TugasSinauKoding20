package com.example.SinauKodingSalwa.service;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BukuService {

    @Autowired
    BukuRepository bukuRepository;

    //Create
    public Buku createBuku(Buku buku){
        return bukuRepository.save(buku);
    }

    //Read
    public List<Buku> findAllBuku(){
        return bukuRepository.findAll();
    }

    public List<Buku> findByJudulContainingAndPenulisContaining(String judul, String penulis){
        return bukuRepository.findByJudulContainingAndPenulisContaining(judul, penulis);
    }

    //Update
    public Buku updateBukuById(Buku buku, int id){
        Buku reference = bukuRepository.findById(id).get();
        reference.setJudul(buku.getJudul()!=null?buku.getJudul():reference.getJudul());
        reference.setPenulis(buku.getPenulis()!=null?buku.getPenulis():reference.getPenulis());
        reference.setPenerbit(buku.getPenerbit()!=null?buku.getPenerbit():reference.getPenerbit());
        reference.setTahunTerbit(buku.getTahunTerbit()!=null?buku.getTahunTerbit():reference.getTahunTerbit());
        reference.setJenisBuku(buku.getJenisBuku()!=null?buku.getJenisBuku():reference.getJenisBuku());
        return bukuRepository.save(reference);
    }

    //Delete
    public Boolean deleteBukuById(int id){
        Buku reference = bukuRepository.findById(id).orElse(null);
        if(reference != null){
            bukuRepository.delete(reference);
            return true;
        }else{
            return false;
        }
    }
}