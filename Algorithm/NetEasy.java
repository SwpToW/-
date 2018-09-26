package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * 网易笔试之等差数列
 */
public class NetEasy {
	public static LinkedList<Integer> resourse=new LinkedList<Integer>();
      public static void main  (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++){
			s[i]=sc.nextInt();
		}
		//取到a数列s[i]，单独写一个反转方法reverse
		
	    for(int i=0;i<n;i++){
	    	resourse.add(s[i]);
	    	
	
	    	reverse(resourse);
	    	
	    }
	    System.out.println(resourse);
		
	}
      public static void reverse(LinkedList<Integer> r){
    	  int n=r.size();//记录链表的长度
    	  int low=0;
    	  int high=n-1;
    	  int temp=0;
    	  if(n==1){
    		  
    	  }
    		  while(low>high){
    			  Swap(r.get(low),r.get(high));
    			  low++;
    			  high--;
    		  }
    	
    	 
      }
	private static void Swap(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
	}
    
}
