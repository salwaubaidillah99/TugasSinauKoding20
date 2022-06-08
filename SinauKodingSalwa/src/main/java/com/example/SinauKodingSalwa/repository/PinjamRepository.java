package com.example.SinauKodingSalwa.repository;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.entity.Buku;
import com.example.SinauKodingSalwa.entity.Pinjam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PinjamRepository extends JpaRepository<Pinjam, Integer> {
    List<Pinjam> findByJudulContainingAndPenulisContaining(String judul, String penulis);
}
