package yayati;
import java.util.*;
public class TreeInOut_CollectionApi {
/*
 Here TreeNode IS Function Defined IN User-Defined Package "yayati" &
 Queue is An Interface Used from The In-Built Package java.util.
 FuthurMore We Will Define our Own Made Queue in Future.
 */
	//ITERATIVE INPUT
	 public static TreeNode<Integer> input()
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("ENTER ROOT OF TREE");
	        int data=sc.nextInt();
	        TreeNode<Integer> root=new TreeNode<Integer>(data);
	        Queue<TreeNode<Integer>> pn=new LinkedList<>();
	        pn.add(root);//ENQUEUE
	        while(!pn.isEmpty())
	        {
	            TreeNode<Integer> fn=pn.remove();//DEQUEUE
	            System.out.println("ENTER NUM. OF CHILD OF "+fn.data);
	            int noc=sc.nextInt();
	            // 1st WAY 
	           /* while(noc--!=0)
	            {
	                System.out.println("ENTER CHILD");
	                int child_data=sc.nextInt();
	                TreeNode<Integer> child=new TreeNode<Integer>(child_data);
	                fn.children.add(child);
	                pn.add(child);
	            }*/
	            
	            // 2nd WAY
	            for(int i=1;i<=noc;i++)
	            {
	            	System.out.println("ENTER "+i+"th CHILD OF "+fn.data);
	            	int child_data=sc.nextInt();//CHILD DATA
	            	TreeNode<Integer> child=new TreeNode<Integer>(child_data);//CHILD NODE CREATED
	            	fn.children.add(child);//CHILD NODE LINKED TO ITS PARENT NODE
	            	pn.add(child);//ENQUEUE
	            }
	        }
	        sc.close();
	        return root;
	    }
	 public static void print(TreeNode<Integer> root)
	    {
	        Queue<TreeNode<Integer>> pn=new LinkedList<>();
	        pn.add(root);
	       // System.out.print(root.data+"-> ");
	        while(!pn.isEmpty())
	        {
	        	
	            TreeNode<Integer> fn=pn.remove();
	            System.out.print(fn.data+"-> ");
	            for(int i=0;i<fn.children.size();i++)
	            {
	            	
	                System.out.print(","+fn.children.get(i).data);
	                pn.add(fn.children.get(i));
	            }
	            System.out.println(".");
	        }
	    }
	     
	 public static void main(String []args){
	        System.out.println("WELCOME TO THE TREE");
	        TreeNode<Integer> root=TreeInOut_CollectionApi.input();
	        TreeInOut_CollectionApi.print(root);
	        System.out.println("DONE");
	     }
}
