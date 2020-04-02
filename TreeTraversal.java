package yayati;

public class TreeTraversal {
	//postOrder Traversal
	public static void postOrder(TreeNode<Integer> root)
	{
		for(int i=0;i<root.children.size();i++)
			postOrder(root.children.get(i));
			System.out.print(root.data+" ");
			return;
	}
	//preOrder traversal
	public static void preOrder(TreeNode<Integer> root)
	{
		
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++)
			preOrder(root.children.get(i));
			return;
	}
	
	public static void main(String [] args)
	{
		TreeNode<Integer> root=TreeInOut_CollectionApi.input();
		System.out.println("POST-ORDER");
		postOrder(root);
		
		System.out.println("\nPRE-ORDER");
		preOrder(root);
	}
}
