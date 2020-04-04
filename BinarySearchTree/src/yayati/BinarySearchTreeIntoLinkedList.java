package yayati;

import java.util.LinkedList;

public class BinarySearchTreeIntoLinkedList {
	public static LinkedList<Integer> arr=new LinkedList<>();
	public static void bstIntoLinkedList(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return ;
		
		bstIntoLinkedList(root.left);
		arr.add(root.data);
		bstIntoLinkedList(root.right);
		
	}
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		bstIntoLinkedList(root);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
