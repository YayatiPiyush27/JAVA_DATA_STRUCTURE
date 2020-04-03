package yayati;

import java.util.ArrayList;

//GENERIC CLASS TYPE
public class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	// PARA. CONSTRUCTURE
	public TreeNode(T data)
	{
		this.data=data;
		children=new ArrayList<>();
	}
	
}

