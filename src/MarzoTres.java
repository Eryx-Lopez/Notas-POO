public class MarzoTres {

    //Para encapsular se tienen que poner los atributos como privadas
    private String nombre;
    private int edad;
    private String matricula;
    //De ahí click derecho en Generate... y luego a Getter y Setter
    //Se seleccionan los atributos y se genera lo de la parte de abajo

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    private String materias;
    final int LIMITE_DE_MATERIAS = 10;

}
