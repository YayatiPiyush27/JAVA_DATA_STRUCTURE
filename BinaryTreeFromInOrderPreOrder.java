package yayati;

import java.util.Scanner;
//Calculates and returns left ending index of left tree
public class BinaryTreeFromInOrderPreOrder {
	public static int leftLength(int[] left,int data)
	{
		for(int i=0;i<left.length;i++)
				if(left[i]==data)return i-1;
		return -1;
	}
//Resizing array For Recursive Calls
	public static int[] newArray(int[] arr,int start,int end)
	{
		int[] newArr=new int[end-start+1];
		int index=0;
		for(int i=start;i<=end;i++)
		{
			newArr[index]=arr[i];
			index++;
		}
			
		return newArr;
	}

	public static BinaryTreeNode<Integer> builtTree(int[] in,int[] pre )
	{
		//BaseCase
		if(pre.length<=0)return null;
		
		int data=pre[0];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(data);
		int in_left_starting_index=0;
		int in_left_ending_index=leftLength(in,root.data);
		int pre_left_starting_index=1;
		int pre_left_ending_index=in_left_ending_index+1;
		
		int in_right_starting_index=in_left_ending_index+2;
		int in_right_ending_index=in.length-1;
		int pre_right_starting_index=pre_left_ending_index+1;
		int pre_right_ending_index=in.length-1;
		//Logic Is In Finding Start/End Of Left/Right Tree And Call On Them Recursively
		int[] l1=newArray(in,in_left_starting_index,in_left_ending_index);
		int[] r1=newArray(pre,pre_left_starting_index,pre_left_ending_index);
		/*for(int i:l1)
			System.out.print(i+" ");
		System.out.println("\nDONE");
		for(int i:r1)
			System.out.print(i+" ");
		System.out.println("\nDONE");*/
		BinaryTreeNode<Integer> left=builtTree(l1,r1);
		
		int[] l2=newArray(in,in_right_starting_index,in_right_ending_index);
		int[] r2=newArray(pre,pre_right_starting_index,pre_right_ending_index);
		
		/*for(int i:l1)
			System.out.print(i+" ");
		System.out.println("\nDONE");
		for(int i:r1)
			System.out.print(i+" ");
		System.out.println("\nDONE");*/
		BinaryTreeNode<Integer> right=builtTree(l2,r2);
		root.left=left;
		root.right=right;
		return root;
	}

	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] in=new int[n];
		for(int i=0;i<n;i++)
			in[i]=sc.nextInt();
		
		int m=sc.nextInt();
		int[] pre=new int[m];
		for(int i=0;i<n;i++)
			pre[i]=sc.nextInt();
		sc.close();
		BinaryTreeNode<Integer> root=builtTree(in,pre);
		BinaryTreeInOutLevelWise.print(root);
	}
}
