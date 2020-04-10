package yayati;
import java.util.*;
public class PriorityQueue {
	private ArrayList<Integer> heap;
	//Constructor
	public PriorityQueue()
	{
		heap=new ArrayList<>();
	}
	//isEmpty Function
	boolean isEmpty() {
		return heap.size()==0;
	}
	//size function
	int size()
	{
		return heap.size();
	}
	int getMin() throws PriorityQueueException
	{
		if(isEmpty())
			throw new PriorityQueueException();
		return heap.get(0);
			
	}
	void insert(int data)
	{
		heap.add(data);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0)//Up-Heapification
		{
			if(heap.get(parentIndex)>heap.get(childIndex))
			{
				//Swapping
				int temp=heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
				return;
		}
	}
	int removeMin() throws PriorityQueueException
	{
		if(isEmpty())
			throw new PriorityQueueException();
		
		int data=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));//Swapping Last element with Root
		heap.remove(heap.size()-1);
		int rootIndex=0;
		int minIndex=0;
		int leftIndex=1,rightIndex=2;
		while(leftIndex<heap.size())//Down-Heapification
		{
			//Finding Minimum Index
			if(heap.get(leftIndex)<heap.get(minIndex))
				minIndex=leftIndex;
			if(rightIndex<heap.size())//Checking If RightChildExist
			if(heap.get(rightIndex)<heap.get(minIndex))
				minIndex=rightIndex;
			//Swapping
			if(rootIndex==minIndex)
				break;
			else
			{
				int temp=heap.get(rootIndex);
				heap.set(rootIndex, heap.get(minIndex));
				heap.set(minIndex,temp);
				//Updating Parent Child
				rootIndex=minIndex;
				leftIndex=2*rootIndex+1;
				rightIndex=leftIndex+1;
			}	
		}
		return data;
	}
}
