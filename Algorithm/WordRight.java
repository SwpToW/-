package Algorithm;

import java.util.Scanner;

/*
 * 单词循环右移
 */
public class WordRight {
     public static void main(String[] args) {
    	 int count=0;//计数
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] word=new String[n];
		for(int i=0;i<n;i++){
			word[i]=sc.next();
		}
		//第一个指针切割
		for(int i=0;i<n;i++){
		
			String x=word[i].substring(0, 1);
			String[] result=word[i].split(x);
			 for(int j=1;j<n;j++){
			
				 String[] resoure=word[j].split(x);
				 if(resoure[0]!=null){
				 StringBuffer sb=new StringBuffer(resoure[1]);
				 System.out.println(sb);
				 sb.append(resoure[0]);
				 if(result[1].equals(sb)){
					 count++;
				 }
				 }
				
			 }
		}
		System.out.println(count);
     }
}
