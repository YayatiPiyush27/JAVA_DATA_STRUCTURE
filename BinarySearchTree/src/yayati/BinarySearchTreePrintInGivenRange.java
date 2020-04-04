package yayati;

import java.util.Scanner;

public class BinarySearchTreePrintInGivenRange {
	public static void printInRange(BinaryTreeNode<Integer> root,int start,int end)
	{
		if(root==null)
			return;
		if(root.data<=end&&root.data>=start)
		{
			System.out.print(root.data+" ");
			printInRange(root.left,start,end);
			printInRange(root.right,start,end);
		}
		if(root.data<start)
			printInRange(root.right,start,end);
		if(root.data>end)
			printInRange(root.left,start,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER RANGE");
		int start=sc.nextInt();
		int end=sc.nextInt();
		//Keep Scanner Above Calling This Recursive Function
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		/*
		 ERROR OCCURING DUE TO UNKOWN REASONS ??
		 THROWING NI SUCH ELEMET EXCEPTION
		 Scanner sc=new Scanner(System.in);
		System.out.println("ENTER RANGE");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		 */
		
		printInRange(root,start,end);
		System.out.println("\n COMPLETED ");
		sc.close();
	}

}
