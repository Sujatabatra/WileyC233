package amitabh.sorting;

public class MergeSort {
	
	
	public void swap(int [] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public int[] mergeSort(int[] arr,int size, int start, int end) {
		
		if(start>=end)return new int[] {arr[start]};
		
		int mid=start+(end-start)/2;
		
		int [] leftHalf;
		int [] rightHalf;
		int [] merged=new int[size];
		
		leftHalf=mergeSort(arr,mid-start+1,start,mid);
		rightHalf=mergeSort(arr,end-(mid+1)+1,mid+1,end);
		
		merged=merge(leftHalf,rightHalf,merged);
		
		return merged;
		
	}
	
	/*
	 * Time complexity- O(nlogn)
	 * Space complexity- O(n)
	 * 
	 */
	
	private int[] merge(int [] arr1,int [] arr2, int [] merged) {
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				merged[k]=arr1[i];
				i++;
			}
			else {
				merged[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length)
		{
			merged[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			merged[k++]=arr2[j++];
		}
		return merged;
	}
	
	
}
