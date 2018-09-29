package arrayList;
import java.util.*;
class Employee{
	String name;
	int age;
	String dept;
	Employee(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	}
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1= new Employee("Aish", 22, "sdet");    //creating objects of class employee
       Employee e2= new Employee("Shivani", 23, "aem");
       Employee e3= new Employee("Arya", 22, "dotnet");
        ArrayList<Employee> arr= new ArrayList<Employee>();   //creating an arrayList
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
       
        Iterator<Employee> it= arr.iterator();   //iterator to traverse the values
        while(it.hasNext()){
        	Employee e=it.next();
        	System.out.println(e.name);        //To print the values
        	System.out.println(e.age);
        	System.out.println(e.dept);
        }
       
        
       
	}

}
