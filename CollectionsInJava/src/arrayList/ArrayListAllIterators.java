package arrayList;
import java.util.*;
class Solution4{
	public static void insert(ArrayList<String> arr){
	  arr.add("Red");
      arr.add("Yellow");
      arr.add("Green");
      arr.add("Blue");
      arr.add("Pink");
}
	public static void display(ArrayList<String> arr){
		  /*  for(int i=0;i< arr.size();i++){                          //using for loop
  	  System.out.println(arr.get(i).toString());
    }    */ 
   for(String s:arr){                                      //using foreach loop
  	  System.out.println(arr);
    } 
   /* Iterator<String> it=arr.iterator();                       //using iterator
    while(it.hasNext()){
  	  System.out.println("  " + it.next());
  	  
    } */
	}
}
public class ArrayListAllIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> arr= new ArrayList<String>();
       Solution4.insert(arr);
       Solution4.display(arr);
  
	}

}
