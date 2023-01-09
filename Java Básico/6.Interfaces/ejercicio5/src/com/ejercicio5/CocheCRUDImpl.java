package com.ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 * Se crea la clase CocheCRUDImpl que implementa la interfaz CocheCRUD.
 */
public class CocheCRUDImpl implements CocheCRUD {

    /**
     * Se define la lista de coches tipo Coche como una ArrayList para guardar en él los elementos.
     */
    List<Coche> coches = new ArrayList<>();

    /**
     * El ejercicio pide imprimir por consola el nombre del método,
     * pero se incluye el objeto en la lista "coches" para probar las listas.
     * @param coche - objeto tipo Coche.
     */
    @Override
    public void save(Coche coche) {
        System.out.println("método save() guarda un coche en la lista");
        coches.add(coche);
    }

    /**
     * El ejercicio pide imprimir por consola el nombre del método,
     * pero se devuelve el objeto de la lista "coches" para probar las listas.
     * @return devuelve la lista coches.
     */
    @Override
    public List<Coche> findAll() {
        System.out.println("método findAll() devuelve la lista de coches");
        return coches;
    }

    /**
     * El ejercicio pide imprimir por consola el nombre del método,
     * pero se elimina el objeto de la lista "coches" para probar las listas.
     * @param coche - objeto tipo Coche.
     */
    @Override
    public void delete(Coche coche) {
        System.out.println("método delete() borra un coche de la lista");
        coches.remove(coche);
    }
}
