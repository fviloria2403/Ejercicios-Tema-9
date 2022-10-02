public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(23);
        cliente.setNombre("Jr");
        cliente.setTelefono(640073229);
        cliente.setCredito(5555);
        trabajador.setSalario(1200);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        System.out.println(trabajador.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}