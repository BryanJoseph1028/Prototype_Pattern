import java.util.List;

public class Demo {
    public static void main(String [] args) throws CloneNotSupportedException{
        Empleado emps = new Empleado();
        emps.loadData();

        //usar metodo clone para tener objetos empleado
        Empleado empsNew = (Empleado)  emps.clone();
        Empleado empsNew1 = (Empleado) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("marcos");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("gaby");
        System.out.println("lista original" +emps.getEmpList());
        System.out.print("lista add" +list);
        System.out.println("lista remove"+list1);
    }
}
