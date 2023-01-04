package apuntes;
public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 14;

/*         CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.matricula = "ABC 1234 YZ";
        
        System.out.println(cocheElectrico.compruebaMatricula(cocheElectrico.matricula)); */

        coche.setSonido("BRR");
        System.out.println(coche.getSonido());
    }
}

abstract class Vehiculo {   //las clases abstractas no se pueden instanciar
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {                                                // Se instancia la clase con el constructor
        System.out.println("Estoy en el constructor de Vehiculo");  // Al llamar al constructor del hijo, se invoca el constructor del padre
    }

    abstract public String getSonido();                 // Las clases abstractas nos dicen que tenemos que hacer algo pero no nos dicen cómo tenemos que hacerlo
    abstract public void setSonido(String sonido);      // Las clases derivadas implementas sus propios métodos

/*     public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXXX") {
            return true;
        }

        return false;
    } */
}

class Coche extends Vehiculo {  //extends se usa para que una clase herede de otra
    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

// final class CocheElectrico extends Coche {}  // final hace que no se pueda heredar de esta
                                                // cuando una clase hereda de otra clase que también está heredando, se llama herencia multinivel

class Moto extends Vehiculo {
    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

/* class Motor {
    String tipoMotor;

    public Motor() {
        System.out.println("Estoy en el constructor de motor");
    }
}

// class Coche extends Vehiculo, Motor {    // Herencia múltiple
                                            // JAVA no admite herencia múltiple
// } */

// INTERFACES
interface Culo {    // al igual que las clases abstractas, las inferfaces nos dan funciones que los herederos tienen que implementar
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Pedo implements Culo {
    public void Acelerar(int cuantaVelocidad){}
    public void Frenar(int cuantaVelocidad){}
}