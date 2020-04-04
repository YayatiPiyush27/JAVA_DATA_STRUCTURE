package yayati;

public class BinarySearchTreeCheckBSTEfficient {
	public static Triplet<Integer,Integer,Boolean> checkBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return new Triplet<>(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			
		Triplet<Integer,Integer,Boolean> left=checkBST(root.left);
		Triplet<Integer,Integer,Boolean> right=checkBST(root.right);
		
		if(left.second<root.data && right.first>=root.data && left.third && right.third)
			return new Triplet<>(Math.min(root.data,Math.min(left.first, right.first)),Math.max(root.data,Math.max(left.second, right.second)),true);
		else
			return new Triplet<>(Math.min(root.data,Math.min(left.first, right.first)),Math.max(root.data,Math.max(left.second, right.second)),false);
	}

	public static void main(String[] args) {
		System.out.print(checkBST(BinaryTreeInOutLevelWise.input()).third);

	}

}
