public class Main {

    /*
    Primera parte:
    - Crear una función con tres parámetros que sean números que se suman entre sí.
    - Llamar a la función en el main y darle valores.

    Segunda parte:
    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.*/

    public static void main(String[] args) {
        System.out.println(suma(1,2,3));    //imprime la llamada a la función suma y le pasa 3 valores

        coche miCoche = new coche();
         miCoche.SumarPuertas();
          System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) { // función que devuelve la suma de 3 valores
        return a + b + c;
    }
}

class coche {   // clase coche donde se define un integer con el número de puertas y una función para incrementar el integer
    public int puertas = 2;

    public void SumarPuertas() {
        this.puertas++;
    }
}

