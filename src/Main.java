public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona = new Persona();

        nuevaPersona.setNombre("Daniel");
        nuevaPersona.setEdad(27);
        nuevaPersona.setTelefono("667584933");

        System.out.println(nuevaPersona.getNombre());
        System.out.println(nuevaPersona.getEdad());
        System.out.println(nuevaPersona.getTelefono());
        
        }

    }
    class Persona{

        private String nombre;
        private int edad;
        private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre()  {
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

    }
