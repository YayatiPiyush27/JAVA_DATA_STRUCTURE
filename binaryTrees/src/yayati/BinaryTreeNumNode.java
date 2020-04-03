package yayati;

public class BinaryTreeNumNode {

	public static int numNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int count=1;
		count+=numNode(root.left);
		count+=numNode(root.right);
		return count;
	}
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		BinaryTreeInOutLevelWise.print(root);
		int num=numNode(root);
		System.out.print("NUMBER OF NODES : "+num);
	}
}
