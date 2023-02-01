package com.ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/**
 * Ejercicios de los temas 7, 8 y 9
 * Como punto 9 del ejercicio, se ha incluído un menú que recoge por teclado el input numérico para saber
 * el resultado de qué ejercicio mostrar.
 */
public class Main {
    public static void main(String[] args) {



        boolean next = false;
        do {
            MainMenu.MenuPrincipal();
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1 -> {
                    /*
                     * imprimir la llamada a la función reverse.
                     */
                    System.out.println("Revertir una cadena de texto:");

                    System.out.println(ReverseString.reverse("hola mundo"));  //llamada a la función reverse
                }
                case 2 -> {
                    /*
                     * 1. Se crea una Array de Strings y se recorre mostrando sus valores.
                     */
                    System.out.println("Recorrer array unidimensional de Strings:");

                    String[] stringArray = {
                            "Juan",
                            "Pablo",
                            "Pedro"
                    };
                    ArrayUnid arrayUnid = new ArrayUnid();  //constructor
                    arrayUnid.arraySt = stringArray;        //asignación de Array
                    arrayUnid.ArrayUni();                  //llamada a la función
                }
                case 3 -> {
                    /*
                     * 2. Se crea una Array bidimensional de enteros y se recorre mostrando la posición y el valor dentro de esta.
                     */
                    System.out.println("Recorrer array bidimensional de enteros:");

                    int[][] arrayBi = new int[2][3];
                    arrayBi[0][0] = 1;
                    arrayBi[0][1] = 2;
                    arrayBi[0][2] = 3;
                    arrayBi[1][0] = 10;
                    arrayBi[1][1] = 20;
                    arrayBi[1][2] = 30;

                    ArrayBidi arrayBidi = new ArrayBidi();  //constructor
                    arrayBidi.arrayInt = arrayBi;           //asignación de Array
                    arrayBidi.ArrayBidim();                  //llamada a la función
                }
                case 4 -> {
                    /*
                     * 3. Se crea un Vector de Integers con tamaño inicial de 5 valores y se eliminan el 2º y el 3.er elemento.
                     */
                    System.out.println("Crear un vector con 5 elementos y borrar el 2º y el 3º:");

                    Vector<Integer> intVector = new Vector<>();
                    intVector.add(1);
                    intVector.add(2);
                    intVector.add(3);
                    intVector.add(4);
                    intVector.add(5);

                    VectorInt vectorInt = new VectorInt();      //constructor
                    vectorInt.vector = intVector;                 //asignación de Vector
                    System.out.println(vectorInt.VectorInteger());  //llamada a la función
                }
                case 5 ->
                    /*
                     * 4. Se muestra en pantalla la respuesta a esta pregunta.
                     */
                        System.out.println("""
                                La capacidad inicial por defecto de un vector es de 10. Cada vez que se supera esa cantidad,
                                se duplica la capacidad del vector (si no se ha definido el incremento) en una copia de este
                                y se copian ahí los elementos, por lo que cada vez que se duplica el vector, incrementa el
                                consumo en memoria de la aplicación ralentizando esta.""");
                case 6 -> {
                    /*
                     * 5. Se crea ArrayList de tipo String, se copia a una LinkedList y se recorren ambas mostrando el valor.
                     */
                    System.out.println("Se crea una ArrayList de tipo String, se copia a una LinkedList y se recorren ambas:");

                    ArrayList<String> list = new ArrayList<>();
                    list.add("Antonio");
                    list.add("Baltasar");
                    list.add("Cesar");

                    LinkedList<String> linkedList = new LinkedList<>(list);

                    ArrayListString arrayList = new ArrayListString();  //constructor
                    arrayList.lista = list;                             //asignación de ArrayList
                    arrayList.listaEnlazada = linkedList;               //asignación de LinkedList
                    arrayList.ArrayListSt();                        //llamada a la función
                }
                case 7 -> {
                    /*
                     * 6. Se crea un ArrayList de tipo entero, se rellena con los números del 1 al 10 y se eliminan los pares.
                     */

                    System.out.println("Se crea un ArrayList de tipo entero, se rellena con los números del 1 al 10 y se eliminan los pares:");
                    ArrayListInt arrayListInt = new ArrayListInt(); //constructor
                    arrayListInt.add();                             //llamada a la función add() definida en la clase.
                    System.out.println(arrayListInt.remove());      //llamada a la función remove() definida en la clase.
                }
                case 8 -> {
                    /*
                     * 7. Se crea una función DividePorCero que lanza una excepción aritmética que se recoge en la llamada.
                     */
                    System.out.println("Se crea una función que divide por 0 y devuelve una excepción aritmética:");
                    try {
                        new DividePorCero(7, 0);                   //llamada a la función divide por 0
                    } catch (ArithmeticException e) {
                        System.out.println("Esto no puede hacerse: " + e.getMessage());
                    }
                }
                case 9 -> {
                    /*
                     * 8. Se crea una función que copia los datos de un fichero a otro.
                     */

                    System.out.println("Se crea una función que copia los datos de un fichero a otro:");
                    InputStream fileIn = null;
                    try {
                        fileIn = new FileInputStream("src/origen.txt");
                    } catch (FileNotFoundException e) {
                        System.out.println("El fichero no existe: " + e.getMessage());
                    }

                    PrintStream fileOut = null;
                    try {
                        fileOut = new PrintStream("src/destino.txt");
                        System.out.println("Copiado el fichero origen.txt en el fichero destino.txt");
                    } catch (FileNotFoundException e) {
                        System.out.println();
                    }

                    try {
                        assert fileIn != null;
                        assert fileOut != null;
                        new CopyFile(fileIn, fileOut);
                    } catch (IOException e) {
                        System.out.println("Error de entrada/salida: " + e.getMessage());
                    }
                }
                case 0 -> {
                    System.out.println("saliendo del programa");
                    next = true;
                }
                default -> System.out.println("Esa no es una opción válida.");
            }
            System.out.println("Presiona una tecla para continuar...");
            Scanner pause = new Scanner(System.in);
            pause.nextLine();
        } while (!next);



    }
}
