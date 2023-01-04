public class Main {

    /*
    En este ejercicio practicarás las estructuras de control, para ello deberás crear:

    - Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    - Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        - Incrementar el valor de la variable en uno cada vez que se ejecute.
        - Mostrarlo por pantalla cada vez que se ejecute.

    - Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

    - Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando 
    en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

    - Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion 
    se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

    public static void main(String[] args) {

        /*Primera parte:
         * Sentencia IF que comprueba si el número dado es positivo, negativo o 0
         */

        System.out.println("Primera parte:");
        
        int numeroIf = 5;

        if(numeroIf > 0) {
            System.out.println("El valor de numeroIf (" + numeroIf + ") es positivo");
        } else if(numeroIf < 0) {
            System.out.println("El valor de numeroIf (" + numeroIf + ") es negativo");
        } else {
            System.out.println("El valor de numeroIf es 0");
        }

        /*Segunda parte: 
         * Sentencia WHILE que muestra el valor de un número mientras este sea inferior a 3
        */

        System.out.println("Segunda parte:");

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println("El valor de numeroWhile es " + numeroWhile);
            numeroWhile++;
        }

        /*Tercera parte:
         * bucle DO WHILE que muestre el valor de mientras que este sea inferior a 3 pero solo una vez
         */

        System.out.println("Tercera parte:");

        numeroWhile = 0;    // se reinicia la variable a 0 porque en el bucle while anterior se quedó con el valor 3 asignado

        do {
        System.out.println("El valor de numeroWhile es " + numeroWhile);
        numeroWhile = 3;    // se da el valor de 3 a la variable para que no se repita el bucle
        } while(numeroWhile < 3);

        /*Cuarta parte:
        * bucle FOR que muestra un valor inicial de 0 y se irá incrementando mientras sea menor o igual a 3
        */

        System.out.println("Cuarta parte:");

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println("El valor de numeroFor es " + numeroFor);
        }

        /*Quinta parte:
        * Sentencia SWITCH CASE que muestra la estación del año dada en una variable, el default mostrará si el valor de la variable estacion no es una estación
        */

        System.out.print(("Quinta parte:"));
        
        var estacion = "INVIERNO";

        switch(estacion) {
            case "PRIMAVERA":
                System.out.println("estamos en primavera");
                break;
            case "VERANO":
                System.out.println("estamos en verano");
                break;
                case "OTOÑO":
                System.out.println("estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("estamos en invierno");
                break;
            default:
                System.out.println("el valor dado a la variable 'estacion' no es una estación del año");
            
        }
    }
}