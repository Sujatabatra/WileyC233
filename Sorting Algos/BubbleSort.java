//Bubble Sort

package com.sandesh.demo;

public class BubbleSort{
	/*
	 * 3, 5, 7, 1, 2
	 * n = 5
	 * 
	 * 3, 5, 1, 2, 7
	 * 
	 * 1, 2, 3, 4, 5
	 * 
	 * Best case time complexity : O(n)
	 * Worst case time complexity : O(n * n)
	 * Space complexity : constant = O(1)
	 */
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n-1; i++) {
			swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
	}
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
