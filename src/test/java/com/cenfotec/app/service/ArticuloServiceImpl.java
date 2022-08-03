package com.cenfotec.app.service;

import com.cenfotec.app.domain.Articulo;
import com.cenfotec.app.repo.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Autowired
    ArticuloRepository articuloRepo;

    @Override
    public void save(Articulo articulo) {
        articuloRepo.save(articulo);
    }
}
