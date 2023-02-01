package com.ejercicio6;

public class MainMenu {
    public static void MenuPrincipal() {
        System.out.println("""
                Elige qué ejercicio mostrar:
                1. Mostrar la cadena 'hola mundo' al revés.
                2. Recorrer array unidimensional de Strings.
                3. Recorrer array bidimensional de enteros.
                4. Crear un vector con 5 elementos y borrar el 2º y el 3º.
                5. ¿Cual es el problema de utilizar Vector con la capacidad por defecto si hay 1000 elementos?
                6. Crear una ArrayList de tipo String, copiarla en una LinkedList y recorrer ambas.
                7. Crear una ArrayLit de tipo int, rellenar del 1 al 10 y eliminar los números pares.
                8. Crear una función DividePorCero que devuelva una excepción aritmética.
                9. Utilizar InputStream y PrintStream para copiar un fichero a otro.
                0. Salir.

                Elige la opción numérica a ejecutar:\s""");
    }
}
