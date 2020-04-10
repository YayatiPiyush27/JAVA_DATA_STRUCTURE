package yayati;
import java.util.Comparator;
import java.util.PriorityQueue;

class MaxHeapComparator implements Comparator<Integer>
{
	//User Defined Comapre function
	@Override
	public int compare(Integer a, Integer b) {
		if(a<b)
			return 1;
		else if(a>b)
			return -1;
		else
			return 0;
	}
	
}
public class PriorityQueuemMaxHeap {
	public static void main(String[] arg)
	{
		int[] arr= { 2,4,1,9,6,8};
		/*MIN HEAP
		//By Default .. The default object of comparor is passsed ;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		*/
		//Max Heap
		// Method 1 User Defined
		MaxHeapComparator obj=new MaxHeapComparator();
		PriorityQueue<Integer> pq=new PriorityQueue<>(obj);
		
		//Max Heap
		// Method 2 Pre Defined
		/*
		  PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		 */
		for(int i: arr)
			pq.add(i);
		for(int i=0;i<arr.length;i++)
			System.out.print(pq.remove()+" ");
	}
}
