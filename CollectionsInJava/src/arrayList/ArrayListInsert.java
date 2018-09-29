package arrayList;
import java.util.*;
class Solution2{
	public static void insert(ArrayList<String> arr){
		  arr.add("Red");
	      arr.add("Yellow");
	      arr.add("Green");
	      arr.add("Blue");
	      arr.add("Pink");
	      arr.add(1,"Purple");     //Adds this element at index 1
	     arr.remove("Red");      //Removes the element from the arrayList
	}
	public static void display(ArrayList<String> arr){
		 for(int i=0;i<arr.size();i++){
		      System.out.println(arr.get(i).toString());
		      
		      }
	}
	}
public class ArrayListInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> arr= new ArrayList<String>();
      Solution2.insert(arr);
      Solution2.display(arr);
     
	}

}
