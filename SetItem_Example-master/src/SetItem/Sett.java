package SetItem;
import java.util.*;

public class Sett {

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,4,10,5,5,5,2,11};
		int [] array1= {1,2,1,2,5,3,6,8};
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		for(int item:array) {
			set1.add(item);
		}
		for(int item:array1) {
			set2.add(item);
		}
		
		System.out.println("The first set is: " + set1);
		System.out.println("The second set is: " + set2);
		
		Set<Integer> union=new HashSet<Integer>(set1);//copy the set1
		union.addAll(set2);//add items in set2
		System.out.println("The union set is: " + union);
		
		Set<Integer> intersection= new HashSet<Integer>(set1);//copy the set1
		intersection.retainAll(set2);//remove those items,those are not represent in set2,ortak olanları yazdırıyor.
		System.out.println("The intersection set is: " + intersection);
		
		Set<Integer> diff=new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println("The differences set is: " + diff);
		//private body, default package, protected child class,public everyone
	}

}
