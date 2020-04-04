package yayati;

public class BinarySearchTreeCheckBST {
	public static int maximum(BinaryTreeNode<Integer> root)//recursive fun
	{
		if(root==null)
			return Integer.MIN_VALUE;
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root)//recursive fun
	{
		if(root==null)
			return Integer.MAX_VALUE;
		return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
	}
	public static boolean checkBST(BinaryTreeNode<Integer> root)//recursive fun
	{
		if(root==null)
			return true;
		//Find MAX from LEFT_SUBTREE
		int left_max=maximum(root.left);
		//Find MIN from RIGHT_SUBTREE
		int right_min=minimum(root.right);
		
		if(root.data<left_max || root.data>right_min )
			return false;

		boolean left=checkBST(root.left);
		boolean right=checkBST(root.right);
		
		return left && right? true:false;
	}
	/*public static int checkBST(BinaryTreeNode<Integer> root)
	{
		//WRONG SOLUTION
		//GENEAL MISTAKE IN CHECKING BST 
		//WE ONLY CHECK WITH ITS IMMIDIATE ROOT ,BUT WE HAVE TO CHECK WITH ALL THE ROOTS
		int max,min;
		if(root==null)
			return 0;
		int left=checkBST(root.left);
		int right=checkBST(root.right);
		if(left==-1||right==-1)
			return -1;
		if(root.left!=null && root.right!=null)
		{
			if(root.left.data<=root.data&&root.data<=root.right.data)//GENERAL MISATKE
				return 1;
			else
				return -1;	
		}
		return 1;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		//System.out.println("INPUT DONE");
		boolean flag=checkBST(root);
		if(flag)
			System.out.print("TRUE");
		else
			System.out.print("FLASE");
		
	}

}
