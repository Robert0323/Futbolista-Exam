package com.cenfotec.app.service;

import com.cenfotec.app.domain.Antologia;

import java.util.List;
import java.util.Optional;

public interface AntologiaService {
    public void save(Antologia antologia);
    public Optional<Antologia> get(Long id);
    public List<Antologia> getAll();
    public List<Antologia> find(String nombre);
}
