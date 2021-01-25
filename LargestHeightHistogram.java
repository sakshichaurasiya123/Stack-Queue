/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	 greater(arr,n);
	}
	static void greater(int arr[],int n){
	Stack<Integer>s=new Stack<Integer>();
	int sl[]=new int[n];
	int sr[]=new int [n];
	//left smaller
	s.push(0);
	sl[0]=-1;
	
	for(int i=1; i<n; i++){
	    while(!s.empty() && arr[i]<arr[s.peek()])
	        s.pop();
	   if(s.size()==0)
	       sl[i]=-1;
	   else
	    sl[i]=s.peek();
	   s.push(i);
	}
	s.clear();
	//Right smaller
	s.push(arr.length-1);
	sr[arr.length-1]=arr.length;
	for(int i=n-2; i>=0; i--){
	    while(!s.empty() && arr[i]<arr[s.peek()])
	        s.pop();
	   if(s.size()==0)
	       sr[i]=arr.length;
	   else
	    sr[i]=s.peek();
	   s.push(i);
	}
	
	// Main Logic
	int max=Integer.MIN_VALUE;
	
	int curr=0,width=0;
	for(int i=0; i<n; i++){
	    curr=sr[i]-sl[i]-1;
	    curr=curr*arr[i];
	    max=Math.max(curr,max);
	}
	System.out.println(max);
	System.out.println(Arrays.toString(sl));
	System.out.println(Arrays.toString(sr));
	
	
	}
    
}
