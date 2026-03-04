package com.dimas.produk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimas.produk.model.Produk;
import com.dimas.produk.repository.ProdukRepository;

@Service
public class ProdukService {
    @Autowired
    private ProdukRepository produkRepository;

    public List<Produk> getAllProduks(){
        return produkRepository.findAll();
    }

    public Produk getProdukById(long id){
        return produkRepository.findById(id).orElse(null);
    }

    public Produk createProduk(Produk produk){
        return produkRepository.save(produk);
    }

    public void deleteProduk(long id){
        produkRepository.deleteById(id);
    }
}
