/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.peliculas;
import java.util.List;

/**
 *
 * @author diego
 */
public interface Ipeliculas {
    public List<peliculas> getAllpersona(); 
    public peliculas getPersonaById(long id);
    public void savePersona(peliculas persona);
    public void delete(long id); 
    
}
