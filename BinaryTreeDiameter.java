package yayati;

public class BinaryTreeDiameter {
	public static int max=0;
	public static int treeDiameter(BinaryTreeNode<Integer> root)
	{
		if(root==null)return 0;
		
		int left=treeDiameter(root.left);
		int right=treeDiameter(root.right);
		if(left+right>=max)
			max=left+right;
		return left>=right?left+1:right+1;
	}
	public static void main(String[] args)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		//BinaryTreeInOutLevelWise.print(root);
		int h=treeDiameter(root);
		//System.out.println("HEIGHT "+h);
		System.out.println(max);
	}

}
