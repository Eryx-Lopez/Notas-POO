package Marzo;

import java.util.Objects;

public class EstudianteMarzo16 {
    private String name;
    private String ID;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstudianteMarzo16)) return false;
        EstudianteMarzo16 that = (EstudianteMarzo16) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID, age);
    }

    @Override
    public String toString() {
        return "EstudianteMarzo16{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Objects.isNull(name)){
            throw new IllegalArgumentException("El nombre no puede ser un campo vacío");
        }
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EstudianteMarzo16() {   //Es un constructor default. Siempre debe de estar.
    }

    public EstudianteMarzo16(String name, String ID, int age) {
        setName(name);
        this.ID = ID;
        this.age = age;
    }


    public EstudianteMarzo16(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public EstudianteMarzo16(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EstudianteMarzo16 mateo = new EstudianteMarzo16();
        mateo.name = "Mateo";
        EstudianteMarzo16 alfredo = new EstudianteMarzo16();
        alfredo.name = "Alfredo";
        System.out.println(mateo.equals(alfredo));
        System.out.println(alfredo);
        System.out.println(mateo);

    }


}
