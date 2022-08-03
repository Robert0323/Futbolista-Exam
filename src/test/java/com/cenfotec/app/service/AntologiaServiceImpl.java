package com.cenfotec.app.service;

import com.cenfotec.app.domain.Antologia;
import com.cenfotec.app.repo.AntologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AntologiaServiceImpl implements AntologiaService {


    @Autowired
    AntologiaRepository repo;

    @Override
    public void save(Antologia antologia) {
        repo.save(antologia);
    }

    @Override
    public Optional<Antologia> get(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Antologia> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Antologia> find(String nombre) {
        return repo.findByNombreContaining(nombre);
    }
}
