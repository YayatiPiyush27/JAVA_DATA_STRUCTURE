package yayati;
import java.util.*;
public class BinaryTreeMirror {
	public static void printTreeMirror(BinaryTreeNode<Integer> root)
	{
		if(root==null)return;
		Queue<BinaryTreeNode<Integer>> pn=new LinkedList<>();
		pn.add(root);
		while(!pn.isEmpty())
		{
			BinaryTreeNode<Integer> fn=pn.remove();
			String str=fn.data+" : ";
			if(fn.right!=null) {
				pn.add(fn.right);
				str+="LEFT -> "+fn.right.data;
			}
			
			if(fn.left!=null) {
				pn.add(fn.left);
				str+="RIGHT -> "+fn.left.data;
			}
			System.out.println(str);
		}
	}
	
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		System.out.println("INPUT DONE");
		BinaryTreeInOutLevelWise.print(root);
		printTreeMirror(root);
		System.out.println("MIRRORING DONE");
	}
}
