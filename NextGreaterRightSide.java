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
	int res[]=new int[n];
	res[n-1]=-1;
	s.push(arr.length-1);
	for(int i=n-2; i>=0; i--){
	    System.out.println("Stack : "+s);
	    while(!s.empty() && arr[i]>arr[s.peek()])
	        s.pop();
	        if(s.size()==0)
	           res[i]=-1;
	        else
	            res[i]=arr[s.peek()];
	       s.push(i);
	}
	System.out.println(Arrays.toString(res));
	}
    
}
