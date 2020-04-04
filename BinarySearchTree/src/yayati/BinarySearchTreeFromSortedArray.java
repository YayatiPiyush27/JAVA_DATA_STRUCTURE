package yayati;
import java.util.Scanner;
public class BinarySearchTreeFromSortedArray {
	public static int[] resizeArray(int[] arr,int lb,int ub)
	{
		int[] newArray=new int[ub-lb+1];
		int index=0;
		for(int i=lb;i<=ub;i++)
			newArray[index++]=arr[i];
		return newArray;
	}
	public static BinaryTreeNode<Integer> sortedArrayIntoBST(int[] arr)
	{
		int lb=0;
		int ub=arr.length-1;
		int mid=(lb+ub)/2;
		if(lb>ub)
			return null;
		System.out.println(lb+" "+ub+" "+mid);
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
		
		BinaryTreeNode<Integer> left=sortedArrayIntoBST(resizeArray(arr,lb,mid-1));
		BinaryTreeNode<Integer> right=sortedArrayIntoBST(resizeArray(arr,mid+1,ub));
		root.left=left;
		root.right=right;
		return root;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		BinaryTreeNode<Integer> root=sortedArrayIntoBST(arr);
		BinaryTreeInOutLevelWise.print(root);
		sc.close();
	}
}
