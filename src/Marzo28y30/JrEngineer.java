package Marzo28y30;

public class JrEngineer extends Empleado implements Programmer{
    @Override
    public void programar(){
        System.out.println("Programa como puede");
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja blabla");
    }
}
