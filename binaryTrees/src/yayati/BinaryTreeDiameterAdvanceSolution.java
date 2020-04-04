package yayati;

public class BinaryTreeDiameterAdvanceSolution {
	public static Pair<Integer,Integer> treeDia(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return new Pair<>(0,0);
		Pair<Integer,Integer> left=treeDia(root.left);
		Pair<Integer,Integer> right=treeDia(root.right);
		int dia=Math.max(Math.max(left.second, right.second),left.first+right.first+1);
		return new Pair<>(Math.max(left.first, right.first)+1,dia);
	}
	public static void main(String[] arg)
	{
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		System.out.print(treeDia(root).second);
	}
}
