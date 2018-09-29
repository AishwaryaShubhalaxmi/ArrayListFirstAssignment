package arrayList;
import java.util.*;
public class ArrayListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> arr= new ArrayList<String>();
        System.out.println("Enter the elements of the arrayList");
        arr.add("Red");
	      arr.add("Yellow");
	      arr.add("Green");
	      arr.add("Blue");
	      arr.add("Pink");
	      String search="Green";
	      for(int i=0;i<arr.size();i++){
	    	  if(arr.get(i).contains(search)){
	    		  System.out.println("The element is at position " + (i+1));
	    	  }
	      }
	}

}
