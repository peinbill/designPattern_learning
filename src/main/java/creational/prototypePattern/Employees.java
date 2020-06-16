package creational.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        empList=new ArrayList<>();
    }
    public Employees(List<String> list){
        this.empList=list;
    }

    public void loadData(){
        empList.add("1");
        empList.add("2");
        empList.add("3");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();
        for(String s:this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }




}
