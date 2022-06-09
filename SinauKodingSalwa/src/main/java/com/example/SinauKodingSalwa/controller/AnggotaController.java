package com.example.SinauKodingSalwa.controller;
import com.example.SinauKodingSalwa.entity.Anggota;
import com.example.SinauKodingSalwa.response.Response;
import com.example.SinauKodingSalwa.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/anggota")
public class AnggotaController {

    @Autowired
    AnggotaService anggotaService;

    //Create
    @PostMapping
    public Anggota createAnggota(@RequestBody Anggota anggota){
        return anggotaService.createAnggota(anggota);
    }

    //Read
    @GetMapping
    public Response selectAllAnggota(){
        return new Response(anggotaService.selectAllAnggota(), "Data berhasil ditampilkan", HttpStatus.OK);
    }

    @GetMapping(value="findNama")
    public List<Anggota> findByNama(@RequestParam(value = "nama") String string){
        return anggotaService.findByNama(string);
    }

    //Update
    @PutMapping("/{id}")
    public Anggota updateAnggotaById(@RequestBody Anggota param, @PathVariable int id){
        return anggotaService.updateAnggotaById(param, id);
    }

    @DeleteMapping("/{id}")
    public String deleteAnggotaById(@PathVariable int id){
        if(anggotaService.deleteAnggotaById(id)) {
            return "Data berhasil dihapus";
        }else{
            return "Data gagal dihapus";
        }
    }

}