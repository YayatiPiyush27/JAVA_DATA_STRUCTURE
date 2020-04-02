package yayati;

import java.util.Scanner;
//Binary Tree Input/Output Using RECURSION
public class BinaryTreeInOut {

	public static BinaryTreeNode<Integer> input(Scanner sc)
	{
		System.out.println("ENTER ROOT DATA ");
		int root_data=sc.nextInt();
		
		if(root_data==-1)//BASE CASE
			return null;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(root_data);
		root.left=input(sc);//Recursive Call
		root.right=input(sc);//Recursive Call
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)//BASE CASE
			return;
		//My First Approach Printed Data Inversly
		//System.out.println(root.data);
		/*String str=root.data+" :";
		if(!(root.left==null))
		{
			print(root.left);
			str+="LEFT -> "+root.left.data;
		}
			
		if(!(root.right==null))
		{
			print(root.right);
			str+=" RIGHT -> "+root.right.data;
		}
			
		
		System.out.println(str);*/
		//Actual Implementation
		String str=root.data+" :";
		if(!(root.left==null))
			str+="LEFT -> "+root.left.data;
		if(!(root.right==null))
			str+=" RIGHT -> "+root.right.data;
			System.out.println(str);
			print(root.left);
			print(root.right);
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root=input(sc);
		print(root);
	}
}
