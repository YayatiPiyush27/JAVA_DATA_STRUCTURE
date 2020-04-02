package yayati;

public class Array_Of_TreeNode {
	public static void main(String[] arg) {
		//Creating array Of Generic CLass Type
		TreeNode<Integer>[] arr=(TreeNode<Integer>[])new TreeNode[5];//Unchecked Type Casting 
		//NOT RECOMMENDED
		for(int i=0;i<5;i++)
		{
			arr[i]=new TreeNode<Integer>(i);
		}
		
		arr[0].children.add(arr[1]);
		arr[0].children.add(arr[2]);
		arr[0].children.add(arr[3]);
		
		arr[2].children.add(arr[4]);
		
		for(TreeNode<Integer> tree :arr)
		System.out.println(tree+" DATA IS "+tree.data+" CHILD "+tree.children);
		
		//The Statement Below Doesnt Woks
		//System.out.println(((TreeNode<Integer>)arr[2]).children)
	}
}
