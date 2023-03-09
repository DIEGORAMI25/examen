/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.peliculas;
import com.cinelitas.repository.peliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author diego
 */
@Service
public class peliculasService implements Ipeliculas{
    
    @Autowired
    private peliculasRepository peliculasRepository;

    @Override
    public List<peliculas> getAllpelicula() {
        return (List<peliculas>)peliculasRepository.findAll();
}
    
    @Override
    public peliculas getpeliculasById(long id) {
        return peliculasRepository.findById(id).orElse(null);
    }

    @Override
    public void savepeliculas(peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }
}
