public class Main {

/*
Crea una clase Persona con las siguientes variables:
- La edad
- El nombre
- El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(40);
        cliente.setNombre("jose Luis");
        cliente.setTelefono(912345678);
        cliente.setCredito(5000);

        System.out.println("El cliente " + cliente.getNombre() + " tiene " + cliente.getEdad() + 
        " años, su teléfono es el " + cliente.getTelefono() + " y dispone de un crédito de " + cliente.getCredito() + " Euros");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Antonio");
        trabajador.setTelefono(654321789);
        trabajador.setSalario(2000);

        

        System.out.println("El trabajador " + trabajador.getNombre() + " tiene " + trabajador.getEdad() + 
        " años, su teléfono es el " + trabajador.getTelefono() + " y tiene un salario mensual de " + trabajador.getSalario() + " Euros");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}

class Cliente extends Persona {
    float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}