package arrayList;
import java.util.*;
class Solution{
 	public static void insertion(ArrayList<String> arr){
		 
		arr.add("Red");                    //Add the values
	     arr.add("Yellow");
	     arr.add("Green");
	}

public static void display(ArrayList<String> arr){
	 Iterator<String> it=arr.iterator();                 //Print the values
     while(it.hasNext()){
    	 System.out.println("Value= " + it.next());
     }
}
}
public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arr= new ArrayList<String>();   //create an ArrayList
     Solution.insertion(arr);    
     Solution.display(arr);
	}

}
