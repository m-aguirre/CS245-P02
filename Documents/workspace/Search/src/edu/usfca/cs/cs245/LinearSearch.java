package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
