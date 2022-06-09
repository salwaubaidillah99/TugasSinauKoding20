package com.example.SinauKodingSalwa.repository;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.entity.Pinjam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PinjamRepository extends JpaRepository<Pinjam, Integer> {
    List<Pinjam> findById(String id, String penulis);
}
