package yayati;
import java.util.*;
public class PrintKthDepth {
	//LEVEL WISE INPUT TAKING USING QUEUE
	public static TreeNode<Integer> input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROOT DATA");
		int data=sc.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(data);
		Queue<TreeNode<Integer>> pn=new LinkedList<>();
		pn.add(root);
		
		while(!pn.isEmpty()) {
			TreeNode<Integer> fn=pn.remove();
			System.out.println("ENTER NUMBER OF CHILD FOR "+fn.data);
			int noc=sc.nextInt();
			for(int i=0;i<noc;i++)
			{
				System.out.println("ENTER " +i+" CHILD OF"+fn.data);
				int child_data=sc.nextInt();
				TreeNode<Integer> child=new TreeNode<Integer>(child_data);
				pn.add(child);
				fn.children.add(child);
			}
		}
		return root;
	}

	//PRINT Kth LEVEL ELEMENTS ONLY
	public static void KthPrint(TreeNode<Integer> root,int k)
	{
		if(k==0)
		{
			System.out.println(root.data);
			return;
		}
		for(int i=0;i<root.children.size();i++)
			KthPrint(root.children.get(i),k-1);
		return;
	}
	
	public static void main(String[] args)
	{
		TreeNode<Integer> root=input();
		KthPrint(root,3);
		System.out.println("SUCCESS ");
	}
}
