package com.ejercicio5;

/**
 * Crear una interfaz CocheCRUD.
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 * Como métodos de CocheCRUD podemos poner:
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 * * Ejemplo:
 * CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
public class Main {

    /**
     * Se declara el objeto cocheCrud que implementa la interfaz.
     */
    static CocheCRUD cocheCrud;

    /**
     * Se crea un objeto coche1 de tipo Coche.
     * Se inicializa el objeto cocheCrud de tipo CocheCRUDImpl.
     * @param args
     */
    public static void main(String[] args) {

        Coche coche1 = new Coche("Audi", "A4");

        cocheCrud = new CocheCRUDImpl();

        cocheCrud.save(coche1);
        cocheCrud.findAll();
        // System.out.println(cocheCrud.findAll()); // se utiliza esta línea para imprimir el return del método findAll()
        cocheCrud.delete(coche1);
    }
}