package com.cenfotec.app.repo;

import com.cenfotec.app.domain.Antologia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AntologiaRepository extends JpaRepository<Antologia, Long> {
    public List<Antologia> findByNombreContaining(String word);
}
