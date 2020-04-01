package yayati;

public class TreeUse {
	public static void main(String arg[])
	{
		//Creating Object of TreeNode<T> Classs Which Is Generic In Nature
		TreeNode <Integer> root=new TreeNode<>(4);
		TreeNode <Integer> node1=new TreeNode<>(2);
		TreeNode <Integer> node2=new TreeNode<>(3);
		TreeNode <Integer> node3=new TreeNode<>(5);
		TreeNode <Integer> node4=new TreeNode<>(6);
		
		//Class_Object.ArrayList_Object.Function();
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		
		//Printing root data
		System.out.println(root.data);
		
	}
}
