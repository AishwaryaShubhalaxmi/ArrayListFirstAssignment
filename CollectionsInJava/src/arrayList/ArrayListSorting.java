package arrayList;
import java.util.*;
public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Red");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Pink");
        Collections.sort(arr);   //method to sort the elements of an arrayList in ascending order
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);   //Prints the elements in reverse order
        
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(50);
        arr1.add(62);
        arr1.add(42);
        arr1.add(9);
        Collections.sort(arr1);
        System.out.println(arr1);
        Collections.sort(arr1, Collections.reverseOrder());  //Sort the elements in descending order
        System.out.println(arr1);
	}

}
