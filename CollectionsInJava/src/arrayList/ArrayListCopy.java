package arrayList;
import java.util.*;
class Solution6{
public static void insert(ArrayList<String> arr){
	 arr.add("Red");
     arr.add("Yellow");
     arr.add("Green");
     arr.add("Blue");
     arr.add("Pink");
     
     ArrayList<String> arr1= new ArrayList<String>();
     arr1.add("Purple");
     arr1.add("Black");
     arr1.add("Brown");
     arr1.add("White");
     arr1.add("Gray");
     
     arr.addAll(arr1);          //copies String 2 into String 1
     System.out.println(arr);
}
	
}
public class ArrayListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> arr= new ArrayList<String>();
      Solution6.insert(arr);
       
	}

}
