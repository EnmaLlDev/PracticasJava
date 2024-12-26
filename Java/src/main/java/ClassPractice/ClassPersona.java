package ClassPractice;

public class ClassPersona {
    
    private String nombre;
    private String apelilido;
    private int edad;
    private String profesion;

    public ClassPersona() {
    }

    public ClassPersona(String nombre, String apellido, int edad, String profesion) {
        this.nombre = nombre;
        this.apelilido = apellido;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelilido() {
        return apelilido;
    }

    public void setApelilido(String apelilido) {
        this.apelilido = apelilido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
     @Override
    public String toString() {
        return "Esta persona tiene " + "nombre= " + nombre + ", apelilido= " + apelilido 
                + ", edad= " + edad + ", profesion= " + profesion + '}';
    }

}
