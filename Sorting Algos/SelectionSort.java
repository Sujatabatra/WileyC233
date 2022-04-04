package com.java.practice;

public class SelectionSort {
	private int array[];

	public SelectionSort(int[] array) {
		super();
		this.array = array;
	}
	/*
	 * best, average and worst case time Complexity is O(n^2)
	 * Example - 5,3,1,4,2
	 */
	public void selectionSort()
	{
		for(int i = 0; i < array.length; i++){
            int min_ind = i;
            
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[min_ind];
            array[min_ind] = temp;
        }
	}
}
