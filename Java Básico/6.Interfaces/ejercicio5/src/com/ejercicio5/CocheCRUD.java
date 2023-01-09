package com.ejercicio5;


import java.util.List;

/**
 * Se declaran los métodos de la interfaz.
 */
public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);
}
