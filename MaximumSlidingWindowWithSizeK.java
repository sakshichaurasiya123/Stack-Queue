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
	    int k=in.nextInt();
	 greater(arr,n,k);
	}
	static void greater(int arr[],int n,int k){
/* One Way
Stack<Integer>s=new Stack<Integer>();
	int sr[]=new int[n];
	//Next greater
	sr[n-1]=sr.length;
	s.push(arr.length-1);
	for(int i=n-2; i>=0; i--){
	    while(!s.empty() && arr[i]>arr[s.peek()])
	        s.pop();
	   if(s.size()==0)
	    sr[i]=arr.length;
	   else
	    sr[i]=s.peek();
	 s.push(i);
	    
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(sr));
	//Main Logic
	int nex[]=new int[n];
	int j=0;
	for(int i=0; i<(n-k+1); i++){
	    if(j<i)
	        j=i;
	  while(sr[j]<i+k)
	    j=sr[j];
	  System.out.print(arr[j]+" ");
	    }
	    */
	    //Another Optimized Way
	    int i=0;
	    int j=0;
	    ArrayList<Integer>ar=new ArrayList<Integer>();
	    while(i<(n-k+1)){
	        if((j-i)<k)
	           {
	               ar.add(arr[j]);
	               j++;
	           }
	          else  if((j-i)==k){
	              //System.out.println(ar);
	               System.out.print(Collections.max(ar)+" ");
	               ar.remove(0);
	               i++;
	               
	           }
	    }
	   
	}
}
