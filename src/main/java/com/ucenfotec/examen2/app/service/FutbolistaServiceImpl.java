package com.ucenfotec.examen2.app.service;


import com.ucenfotec.examen2.app.domain.Futbolista;
import com.ucenfotec.examen2.app.repo.FutbolistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class FutbolistaServiceImpl implements FutbolistaService {

    @Autowired
    FutbolistaRepo futbolistaRepo;

    public ArrayList<ArrayList<String>> historial = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> getHistorial() {
        return historial;
    }

    @Override
    public void registrarFutbolista(Futbolista futbolista){
        futbolistaRepo.save(futbolista);
    }
    @Override
    public ArrayList<ArrayList<String>> getFutbolistas(){return historial;
    }

    @Override
    public List<Futbolista> listarFutbolistas(){
        return futbolistaRepo.findAll();
    }

    @Override
    public Futbolista getFutbolistaById(long id){
        Optional<Futbolista> optional = futbolistaRepo.findById(id);
        Futbolista futbolista = null;
        if (optional.isPresent())
            futbolista = optional.get();
        else
            throw new RuntimeException(
                    "Futbolista not found for id : " + id);
        return futbolista;
    }

    @Override
    public void save(Futbolista futbolista) {
        futbolista = calcularMasaMuscular(futbolista);
        futbolistaRepo.save(futbolista);

    }

    @Override public List<Futbolista> getAllFutbolistas()
    {
        return futbolistaRepo.findAll();
    }
    @Override public void deleteViaId(long id)
    {
        futbolistaRepo.deleteById(id);
    }


    @Override
    public Futbolista calcularMasaMuscular(Futbolista futbolista) {
        futbolista.setMasaMuscular(futbolista.getPeso() /Math.pow(futbolista.getAltura(),2));
        futbolista.setUltimoPesaje(LocalDate.now().toString());
        ArrayList<String> pesaje = new ArrayList<String>();
        pesaje.add(futbolista.getNombre());
        pesaje.add(String.valueOf(futbolista.getPeso()));
        pesaje.add(String.valueOf(futbolista.getAltura()));
        pesaje.add(String.valueOf(futbolista.getMasaMuscular()));
        pesaje.add(futbolista.getUltimoPesaje());
        historial.add(pesaje);
        return futbolista;
    }
    @Override
    //Esta es la funcion que se realiza para la busqueda por aproximacion pero no se logro conectar a el html de forma correcta
    public  List<Futbolista> aproxFutbolista (String aprox){
        List<Futbolista> lista = futbolistaRepo.findAll();
        List<Futbolista> respuesta = new ArrayList<Futbolista>();
        for(int i = 0;i < lista.size();i++){
            if(lista.get(i).getNombre().contains(aprox) || lista.get(i).getPrimerApellido().contains(aprox) || lista.get(i).getSegundoApellido().contains(aprox)) {
                respuesta.add(lista.get(i));
            }
        }
        return respuesta;
    }
}
