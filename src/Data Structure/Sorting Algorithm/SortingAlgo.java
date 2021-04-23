package SortingAlgo;

import java.util.Arrays;

public class SortingAlgo {
	
	public int [] insertionSort(int [] list) {
		
		for(int i=1;i<list.length;i++) {
			int key=list[i];
			int j=i-1;
			
			while(j >=0 && key<list[j]) {
				int temp=list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
				j--;
			}
		}		
		return list;
	}
	
	public int [] selectionSort(int [] list) {
		
		int temp=0;
		
		for(int i=0;i<list.length;i++) {
			int minValue=list[i];
			int minIndex=i;
			for(int j=i;j<list.length;j++) {
				if(list[j]<minValue) {
					minValue=list[j];
					minIndex=j;
				}
			}
			
			if(minValue < list[i]) {
				temp=list[i];
				list[i]=list[minIndex];
				list[minIndex]=temp;
			}
		}

		return list;
	}
	
	public int [] bubbleSort(int[] list) {
		int temp=0;
		for(int i=0;i<list.length-1;i++) {
			for(int j=0;j<list.length-1-i;j++) {
				if(list[j]>list[j+1]) {
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
		
		
		return list;
	}
	
	public void mergeSort(int[] list, int lowIndex, int highIndex) {
		if(lowIndex==highIndex) {
			return;
		}
		else {
			int middleIndex=(lowIndex+highIndex)/2;
			mergeSort(list,lowIndex,middleIndex);
			mergeSort(list,middleIndex+1,highIndex);
			merge(list, lowIndex, middleIndex+1, highIndex);
		}
	}

	public static void main(String[] args) {
		SortingAlgo sort=new SortingAlgo();
		int[] array= {3,4,2,5,1,7,9,6};
		System.out.println(Arrays.toString(array));
		sort.bubbleSort(array);
		System.out.println(Arrays.toString(array));

	}

}
