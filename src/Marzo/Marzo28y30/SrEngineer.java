package Marzo.Marzo28y30;

public class SrEngineer extends JrEngineer implements Interviewer {
    @Override
     public void interview(){
        System.out.println("Pregunta cosas técnicas");
    }

    @Override
    public void programar(){
        System.out.println("Programa como quiere");
    }
    @Override
    public void trabajar(){
        System.out.println("Trabajo bien ");
    }
}
