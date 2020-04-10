package yayati;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {
		PriorityQueue pq=new PriorityQueue();
		int[] arr= {5,1,9,2,0};
			for(int i:arr)
				pq.insert(i);
			//Need Not To declare Exception coz we are checking pq.isEmpty()
			while(!pq.isEmpty())
				System.out.print(pq.removeMin()+" ");
			System.out.println();

	}

}
