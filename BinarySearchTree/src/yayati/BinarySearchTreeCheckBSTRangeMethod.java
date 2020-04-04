package yayati;

public class BinarySearchTreeCheckBSTRangeMethod {
	public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max)
	{
		if(root==null)
			return true;
		
		if(root.data>max||root.data<min)
			return false;
		boolean left=isBST(root.left,min,root.data-1);
		boolean right=isBST(root.right,root.data,max);
		return left&&right;
		
	}
	public static void main(String[] args)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		int min=root.data-1,max=root.data+1;
		BinaryTreeNode<Integer> temp=root;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
			
		}
		root=temp;
		while(root.right!=null)
		{
			max=root.right.data;
			root=root.right;
			
		}
		//System.out.println(min+" "+max);
		System.out.print(isBST(temp,min,max));
	}
}
