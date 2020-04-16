package arrayList;

import java.util.*;

class stringCompare implements Comparator<String>{
	@Override
	public int compare(String str1,String str2) {
		return str1.compareTo(str2);
	}
}

public class arrayList {
	


	public static void main(String[] args) {
		
		ArrayList<String> citylist=new ArrayList<>();
		
		citylist.add("Aydın");
		citylist.add("Izmir");
		citylist.add("Istanbul");
		
		System.out.println("Size of list " + citylist.size());
		
		System.out.println("Citylist " + citylist);
		
		for(String item:citylist) {
			System.out.println(item);
		}
		
		citylist.add(2,"manisa");
		System.out.println(citylist);
		
		citylist.sort(new stringCompare());
		
		System.out.println("Sorted citylist " + citylist);

		// vectorlist is synhronized but arraylist is not
		//vector contains many legacy method that are not part of the collections framework
		
		
		Vector<Integer> myVector=new Vector<>();
		
		myVector.add(3);
		myVector.add(4);
		myVector.add(5);
		
		System.out.println("\n" + "Vector Lists " + myVector.size());
		
		System.out.println("Vectorlist " + myVector);
		
		for(Integer item1: myVector) {
			System.out.println(item1);
		}
		
		myVector.add(2,-1);
		System.out.println(myVector);
		
	}

}
