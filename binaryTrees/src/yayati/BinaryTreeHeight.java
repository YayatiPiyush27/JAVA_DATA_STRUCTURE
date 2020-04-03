package yayati;

public class BinaryTreeHeight {
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root==null)//BASE CASE
			return 0;
		int max=1;
		int left=heightOfTree(root.left);
		int right=heightOfTree(root.right);
		
		return left<=right?max+right:max+left;
		
	}
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		BinaryTreeInOutLevelWise.print(root);
		int height=heightOfTree(root);
		System.out.print("HEIGHT OF TREE : "+height);
	}

}
