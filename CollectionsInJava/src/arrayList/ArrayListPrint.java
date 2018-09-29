package arrayList;
import java.util.*;
class Solution1{
	public static void insert(ArrayList<String> arr){
	arr.add("Red");            //Adding values
    arr.add("Yellow");
    arr.add("Green");
	}
     public static void display(ArrayList<String> arr){
    	 for(int i=0;i<arr.size();i++){            //Printing the values
		    	System.out.println(arr.get(i));
	} 
     }
    }

public class ArrayListPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> arr= new ArrayList<String>();   //creating arrayList
		 Solution1.insert(arr);
		 Solution1.display(arr);
		   
    }

}
