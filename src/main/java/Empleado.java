import java.util.ArrayList;
import java.util.List;

public class Empleado implements Cloneable{
    private List<String> empList;

    public Empleado(){
        empList = new ArrayList<String>();

    }
    public Empleado(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        empList.add("gaby");
        empList.add("xvb");
        empList.add("Andres");
    }
    public List<String> getEmpList(){
        return empList;
    }
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Empleado(temp);
    }
}
