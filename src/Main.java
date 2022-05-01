public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("jonatan");
        System.out.println("Nombre: " + persona.getNombre());

        persona.setEdad(35);
        System.out.println("Edad: " + persona.getEdad());

        persona.setTelefono("32185246");
        System.out.println("Telefono: " + persona.getTelefono());

    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
