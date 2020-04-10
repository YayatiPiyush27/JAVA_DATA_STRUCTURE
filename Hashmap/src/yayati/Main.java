package yayati;
/* package codechef; // don't place package name! */
import java.io.*;
	public class Main{
	     public static void main(String []args)throws IOException{
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int t=Integer.parseInt(br.readLine());
	       while(t--!=0)
	       {
	    	 int n=Integer.parseInt(br.readLine());
	         if(n<4)
	         {
	        	 System.out.print(1+" ");
	        	 for(int i=1;i<=n;i++)
	        		 System.out.print(i+" ");
	        	 
	         }
	         else
	         {
	        	 if(n%2==0)//EVEN
	        	 {
	        		 System.out.println(n/2);
	        		 for(int i=1;i<=n;i=i+2)
	        			 System.out.println("2 "+i+" "+(i+1)+" ");
	        	 }
	        	 else //ODD
	        	 {
	        		 System.out.println((int)((n-3)/2+1));
	        		 System.out.println("3 1 2 "+n);
	        		 for(int i=3;i<n;i=i+2)
	        			 System.out.println("2 "+i+" "+(i+1)+"");
	        	 }
	         }
	       }
	     }
	}

