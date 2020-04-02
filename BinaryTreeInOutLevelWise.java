package yayati;
import java.util.*;
public class BinaryTreeInOutLevelWise {
//Iterative Solution using Queue Using Linked List
	public static BinaryTreeNode<Integer> input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROOT DATA");
		int root_data=sc.nextInt();
		Queue<BinaryTreeNode<Integer>> pn=new LinkedList<>();
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(root_data);
		pn.add(root);
		while(!pn.isEmpty())
		{
			BinaryTreeNode<Integer> fn=pn.remove();
			System.out.println("ENTER LEFT CHILD OF "+fn.data);
			int left_data=sc.nextInt();
			if(left_data!=-1)
			{
				BinaryTreeNode<Integer> left=new BinaryTreeNode<Integer>(left_data);
				pn.add(left);	
				fn.left=left;
			}
			
			
			System.out.println("ENTER RIGHT CHILD OF "+fn.data);
			int right_data=sc.nextInt();
			if(right_data!=-1)
			{
				BinaryTreeNode<Integer> right=new BinaryTreeNode<Integer>(right_data);
				pn.add(right);	
				fn.right=right;
			}
			
		}
		sc.close();
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root ==null)
			return;
		Queue<BinaryTreeNode<Integer>> pn= new LinkedList<>();
		pn.add(root);
		while(!pn.isEmpty())
		{
			BinaryTreeNode<Integer> fn=pn.remove();
			String str=fn.data+" :";
			if(fn.left!=null)
			{
				str+=" LEFT -> "+fn.left.data;
				pn.add(fn.left);
			}
			if(fn.right!=null)
			{
				str+=" RIGHT -> "+fn.right.data;
				pn.add(fn.right);
			}
			System.out.println(str);
		}
	}
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=input();
		print(root);
		System.out.print("DONE");
	}
}
