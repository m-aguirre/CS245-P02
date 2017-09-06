package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return null;
	}
	//comment for commit
	@Override
	public int search(int[] arr, int target) {
		int max = arr.length;
		int m = 1900000000;
		int min = 0;
		return binaryIterativeSearch(arr, target, m, min);
	}
	
	public int binaryIterativeSearch(int[] arr, int target, int max, int min) {
		
		int mid = Math.floorDiv(arr.length, 2);
		
		while(min <= max) {
			System.out.println(mid);
			if(arr[mid] == target) {
				return mid;
			}
			if(min == max) {
				return -1;
			}
			if(target < arr[mid]) {
				max = mid;
				mid = Math.floorDiv(mid, 2);				
			} else {
				min = mid;
				mid = Math.floorDiv((max + mid), 2);	
			}
		}
		return -1;
	}
}
