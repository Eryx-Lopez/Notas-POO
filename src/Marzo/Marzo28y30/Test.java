package Marzo.Marzo28y30;
public class Test {
    public static void main(String[] args) {
        JrEngineer jr = new JrEngineer();
        SrEngineer sr = new SrEngineer();
        jr.programar();
        sr.programar();
        System.out.println("------------");
        ponerAProgramar(jr);
        ponerAProgramar(sr);

        JrEngineer jr2 = new SrEngineer();
        SrEngineer sr2 = (SrEngineer) jr2;
        Empleado emp = jr2;
        Empleado emp2 = new CEO();
        Empleado emp3 = new Manager();
        System.out.println(emp instanceof SrEngineer);
        System.out.println(emp2 instanceof SrEngineer);
        trabajar(new Empleado());
        trabajar(new JrEngineer());
        trabajar(new SrEngineer());

    }
    static void ponerAProgramar(Programmer programmer)
    {
        programmer.programar();
    }
    static void trabajar(Empleado e) {

    }

}
