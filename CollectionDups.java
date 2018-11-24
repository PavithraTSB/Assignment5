package assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class CollectionDups {

	public static void main(String[] args) {
		ArrayList<Integer>ls=new ArrayList<>();//Using collection getting values in arraylist
		ls.add(100);
		ls.add(45);
		ls.add(100);
		ls.add(78);
		ls.add(98);
		ls.add(45);
		ls.add(34);
        System.out.println("List of numbers before removing dups :"+ls);
		Set<Integer>set1=new LinkedHashSet<>();//To remove duplicates used set 
		set1.addAll(ls);
		System.out.println("List of numbers after removing dups :"+set1);
	}

}
