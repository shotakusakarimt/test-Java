package Classnokinou;

public class Main {
    public static void main(String[] argas){
    Employee2[] Emp=new Employee2[2];
    Emp[0]=new Employee2();
    Emp[1]=new Employee2("Chary");
    for(Employee2 e:Emp){
        e.name();
    }
    Emp[1].Count();
    /*Employee emp1=new Employee();
    emp1.name();
    Employee emp2=new Employee("Chary");
    emp2.name();*/
    }
}
