package yayati;
import java.util.*;
public class BinaryTreeFromInOrderPostOrder {
	public static int[] resizeArray(int[]arr ,int start,int end)
	{
		int[] newArr=new int[end-start+1];
		int pos=0;
		for(int i=start;i<=end;i++)
				newArr[pos++]=arr[i];
		return newArr;
	}
	public static BinaryTreeNode<Integer> builtTree(int[] in,int[] post)
	{
		if(post.length<1)
			return null;
		int root_data=post[post.length-1];
		//System.out.println("ROOT IS "+root_data);
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(root_data);
		//Finding Position Of Root_Data(root) in INORDER
		int root_index=-1;
		for(int i=0;i<in.length;i++)
			if(root_data==in[i])
			{
				//System.out.println(" ROOT FOUND ");
				root_index=i;
				break;
			}
		//System.out.println(" Root_index "+root_index);
		if(in.length==1)return root;
		BinaryTreeNode<Integer> left=builtTree(resizeArray(in,0,root_index-1),resizeArray(post,0,root_index-1))	;
		BinaryTreeNode<Integer> right=builtTree(resizeArray(in,root_index+1,in.length-1),resizeArray(post,root_index,post.length-2));
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
		int[] post=new int[m];
		for(int i=0;i<n;i++)
			post[i]=sc.nextInt();
		sc.close();
		BinaryTreeNode<Integer> root=builtTree(in,post);
		BinaryTreeInOutLevelWise.print(root);
	}
}
