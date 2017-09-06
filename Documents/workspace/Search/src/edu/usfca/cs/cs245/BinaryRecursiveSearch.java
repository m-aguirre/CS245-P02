package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(int[] arr, int target) {
		
		int min = 0;
		int max = arr.length;	
		return binaryRecursiveSearch(arr, target, min, max);
		
	}
	
	
	public int binaryRecursiveSearch(int[] arr, int target, int max, int min) {
		
		int mid = Math.floorDiv(max, 2);
		
		if(arr[mid] == target) {
			return mid;
		}
		if( min >= max ) {
			return - 1;
		}	
		if(target < arr[mid]) {
			return binaryRecursiveSearch(arr, target, mid, min);
		} else {
			return binaryRecursiveSearch(arr, target, max, mid);
		}
		
	}

}
