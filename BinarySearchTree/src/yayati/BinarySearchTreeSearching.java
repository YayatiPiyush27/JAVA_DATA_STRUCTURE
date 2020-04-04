package yayati;

public class BinarySearchTreeSearching {
	public static BinaryTreeNode<Integer> binaryTreeSeach(BinaryTreeNode<Integer> root,int num)
	{
		if(root==null)
			return null;
		if(root.data==num)
			return root;
		BinaryTreeNode<Integer> ans;
		if(root.data>=num)
			ans=binaryTreeSeach(root.left,num);
		else
			ans=binaryTreeSeach(root.right,num);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=BinaryTreeInOutLevelWise.input();
		//BinaryTreeInOutLevelWise.print(root);
		BinaryTreeNode<Integer> ans=binaryTreeSeach(root,1);
		System.out.print(ans.data);

	}

}
