package yayati;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueueKthSortedArray {
	public static void kthSortedArray(int[] arr,int k)
	{
		PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
		int i=0;
		for(;i<3;i++)
			heap.add(arr[i]);
		for(;i<arr.length;i++)
		{
		arr[i-k]=heap.remove();
		heap.add(arr[i]);
		}
		for(int j=0;j<3;j++)
			arr[arr.length-k+j]=heap.remove();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		kthSortedArray(arr,k);
		for(int i:arr)
			System.out.print(i+" ");

	}

}
