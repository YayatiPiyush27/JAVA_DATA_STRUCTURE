package yayati;

import java.util.ArrayList;
import java.util.Scanner;
	
public class BinaryTreeNodePath {
	public static ArrayList<Integer> output=new ArrayList<Integer>();
	public static boolean nodePath(BinaryTreeNode<Integer> root,int data)
	{
		//EFFICIENT
		if(root==null)
			return false;
		
		if(root.data==data)
			return true;
		boolean left=nodePath(root.left,data);
		if(left)
		{
			output.add(root.left.data);
			return left;
		}
			
		boolean right=nodePath(root.right,data);
		if(right)
		{
			output.add(root.right.data);
			return right;
		}
			return false;
		//2nd Way
		/*if(root==null)
			return false;
		
		if(root.data==data)
			return true;
		boolean left=nodePath(root.left,data);
		boolean right=nodePath(root.right,data);
		if(left)
			output.add(root.left.data);
		if(right)
			output.add(root.right.data);
		return left||right;*/
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int data=ob.nextInt();
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		boolean ans=nodePath(root,data);
		output.add(root.data);
		if(ans)
			for(int i:output )
				System.out.print(i+" ");
		else
			System.out.print("NOT FOUND");
		ob.close();
	}

}
