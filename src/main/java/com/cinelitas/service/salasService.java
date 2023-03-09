/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.salas;
import com.cinelitas.repository.salasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author diego
 */
@Service
public class salasService implements Isalas {
    
    @Autowired
    private salasRepository salasRepository;

    @Override
    public List<salas> listCountry() {
        return (List<salas>)salasRepository.findAll(); }
    
}
