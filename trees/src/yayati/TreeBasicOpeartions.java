package yayati;

public class TreeBasicOpeartions {
	//Calulating Height of Tree
public static int height(TreeNode<Integer> root)
{
	if(root.children.size()==0)return 1;
	
	int max=0;
	for(int i=0;i<root.children.size();i++)
	{
		int temp=height(root.children.get(i));//Recursive Call
		if(temp>=max)max=temp;
	}
	return ++max;
}
	//Counting Number Of Nodes
public static int numNode(TreeNode<Integer> root)
{
	if(root==null) return 0; //NOT A BASE CASE KEEP IN MIND
	int count =1;
	for(int i=0;i<root.children.size();i++) //BASE CASE IS AUTOMATICALLY HANDLED HERE
		count+=numNode(root.children.get(i));
	return count;
}
 //Calculating Sum OF Data Of Nodes
public static int sumNode(TreeNode<Integer> root)
{
	if(root==null)return 0;//NOT REQUIRED
	int sum=root.data;
	for(int i=0;i<root.children.size();i++)
			sum+=sumNode(root.children.get(i));
	return sum;
	}

//Counting Number Of Leaves
public static int numLeafNode(TreeNode<Integer> root)
{
	if(root.children.size()==0)//BASE CASE
		return 1;
	int count=0;
	for(int i=0;i<root.children.size();i++)
		count+=numLeafNode(root.children.get(i));
	return count;
}

public static void main(String[] args)
{
	TreeNode<Integer> root=TreeInOut_CollectionApi.input();
	TreeInOut_CollectionApi.print(root);
	
	int num=TreeBasicOpeartions.numNode(root);
	int sum=TreeBasicOpeartions.sumNode(root);
	int height=TreeBasicOpeartions.height(root);
	int numLeaf=TreeBasicOpeartions.numLeafNode(root);
	
	System.out.println("NUMBER OF NODES "+num);
	System.out.println("SUM OF NODES "+sum);
	System.out.println("HEIGHT OF TREE "+height);
	System.out.println("NUMBER OF LEAFS "+numLeaf);
	System.out.print("SUCESSFULL");
}

}

