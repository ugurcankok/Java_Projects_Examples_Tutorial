package BinarySearch;

public class BinarySearch {
	
	public int binarySearch(int [] nums, int key) {
		int low=0;
		int high=nums.length-1;
		
		while(low <= high) {
			int middle=(low+high)/2;
			if(nums[middle]==key) {
				return middle;
			}
			if(key < nums[middle]) {
				high = middle -1 ;
			}else {
				low = middle +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch search=new BinarySearch();
		int [] nums= {1,10,20,47,59,65,75,88,99};
		System.out.println(search.binarySearch(nums, 75));
		

	}

}
