package yayati;

public class PriorityQueueHeapSort {
	//InPlace Insertion/(Heap-Sort) With 0(1)
	//Insert+Delete=HeapSort
	public static void insert(int[] arr,int childIndex)
	{
		int parentIndex=(childIndex-1)/2;
		while(parentIndex>=0)
		{
			if(arr[parentIndex]>arr[childIndex])
			{
				int temp=arr[parentIndex];
				arr[parentIndex]=arr[childIndex];
				arr[childIndex]=temp;
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
				return;
		}
	}
	//Inplace Deleting From Virtual Heap 
	public static int delete(int[] arr,int heapSize)//SortedInDecendingOrder(MinHeap)
	{
		/*Replaceing Last Element With Min-Root & Heapifying*/
		//Replacing
		int temp=arr[0];
		arr[0]=arr[heapSize-1];
		heapSize--;
		//Heapifying
		int parentIndex=0;
		int leftIndex=1;
		int rightIndex=2;
		int minIndex=parentIndex;
		while(leftIndex<heapSize)
		{
			if(arr[leftIndex]<arr[minIndex])
				minIndex=leftIndex;
			if(rightIndex<heapSize && arr[rightIndex]<arr[minIndex])
				minIndex=rightIndex;
			if(minIndex!=parentIndex)//SWAP
			{
				int t=arr[parentIndex];
				arr[parentIndex]=arr[minIndex];
				arr[minIndex]=t;
				parentIndex=minIndex;
				leftIndex=2*parentIndex+1;
				rightIndex=leftIndex+1;
			}
			else
				break;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[]  arr= {5,1,9,2,0,6};
		for(int i=0;i<arr.length;i++)//N
		{
			insert(arr,i);//logN
			/*for(int n:arr)
			System.out.print(n+" ");
			System.out.println();*/
		}
		for(int n:arr)
			System.out.print(n+" ");
			System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			arr[arr.length-1-i]=delete(arr,arr.length-i);
		}
		//Printing
		for(int i:arr)
			System.out.print(i+" ");

	}

}
