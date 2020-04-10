package yayati;
import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthWiseComparator implements Comparator<String>
{
	@Override
	public int compare(String a,String b)
	{
		if(a.length()<b.length())return 1;
		else if(a.length()>b.length()) return -1;
		else
			return 0;
	}
}
public class PriorityQueueStringSortedLengthWise {

	public static void main(String[] args) {
		String[] str=" my name is piyush yayati".split(" ");
		
		StringLengthWiseComparator obj=new StringLengthWiseComparator();
		PriorityQueue<String> pq=new PriorityQueue<>(obj);
		for(String s: str)
			pq.add(s);
		
		for(int i=0;i<str.length;i++)
			System.out.print(pq.remove()+" ");
		

	}

}
