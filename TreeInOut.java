package yayati;
import java.util.*;
public class TreeInOut {
	public static TreeNode<Integer> input(Scanner sc)
	{
		System.out.println("ENTER NODE DATA");
		int n=sc.nextInt();
		TreeNode<Integer> root=new TreeNode<>(n);
		System.out.println("ENTER NUMBER OF CHILD");
		int noc=sc.nextInt();
		while(noc--!=0)
		{
			TreeNode<Integer> child=input(sc);//Recursive Call
			root.children.add(child);
		}
		return root;
	}
	public static void print(TreeNode<Integer> root)
	{
		String str=root.data+":";
		for(int i=0;i<root.children.size();i++)
			str+=root.children.get(i).data+",";
		System.out.println(str);
		
		for(int i=0;i<root.children.size();i++)
		print(root.children.get(i));//Recursive Call
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer> root=input(sc);
		print(root);
	}
}
