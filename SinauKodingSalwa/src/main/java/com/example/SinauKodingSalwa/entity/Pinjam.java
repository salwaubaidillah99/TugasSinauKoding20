package com.example.SinauKodingSalwa.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "anggota")
@Setter
@Getter
public class Pinjam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pinjam")
    private int idPinjam;

    @JsonIgnoreProperties(value = {"pinjamList","handler","hibernateLazyInitializer"},allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_buku")
    private Buku buku;

    @JsonIgnoreProperties(value = {"pinjamList","handler","hibernateLazyInitializer"},allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_anggota")
    private Anggota anggota;

    @Column(name = "tgl_pinjam")
    private Date tglPinjam;

    @Column(name = "tgl_kembali")
    private Date tglKembali;


}
