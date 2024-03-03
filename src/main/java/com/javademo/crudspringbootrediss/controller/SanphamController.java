package com.javademo.crudspringbootrediss.controller;

import com.javademo.crudspringbootrediss.enity.Sanpham;
import com.javademo.crudspringbootrediss.repostory.Sanphamrepo;
import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")

public class SanphamController {
    @Autowired
    Sanphamrepo sanphamrepo;
    @GetMapping("/getallsanpham")
    public List<Sanpham> getallSanpham(){
        List<Sanpham> list = new ArrayList<>();
        sanphamrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    @PostConstruct
    public void saveSP(){
        Sanpham sanpham = new Sanpham();
        sanpham.setId(1);
        sanpham.setName("0 to 1 Vi");
        sanpham.setIty(1);
        sanpham.setPrice(1000000000);
        sanphamrepo.save(sanpham);
    }
    @PostMapping("/savesanpham")
    public Sanpham saveSanpham(@RequestBody Sanpham sanpham){
        sanphamrepo.save(sanpham);
        return sanpham;

    }
    @DeleteMapping("/deletesanpham")
    public void deleteSanpham(@PathParam("id") Integer id){
        sanphamrepo.deleteById(id);
    }
}
