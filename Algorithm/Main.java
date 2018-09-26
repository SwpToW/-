package Algorithm;

import java.util.Scanner;

/*
 * 小C有一张票，这张票的ID是长度为6的字符串，每个字符都是数字，
 * 他想让这个ID变成他的辛运ID，所以他就开始更改ID，每一次操作，
 * 他可以选择任意一个数字并且替换它。  * 如果这个ID的前三位数字之和等于后三位数字之和，
     *    那么这个ID就是辛运的。你帮小C求一下，最少需要操作几次，能使ID变成辛运ID
     *    
     *    比如000000 输出0   无序操作
     *       000018  输出1  前三位任意一位变成9
     *       000999  输出三   有很多方法，但必须有3次替换操作
 */
public class Main {
      public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String id=sc.nextLine();		 
		 int[] res=new int[6];
		 int[] move=new int[6];// 偏移数组，最大能改变的大小
		 int first = 0,last=0;
		 for(int i=0;i<6;i++){
			 res[i]=(int)id.charAt(i)-48;
		 }
		 for(int i=0;i<6;i++){
			 if(i<3)
				 first=first+res[i];
			 else
				 last=last+res[i];		 
		 }
		 System.out.println("first:"+first);
		 System.out.println("last:"+last);
		 //求出偏移数组,每个数字可以移动的最大限度
		 for(int i=0;i<6;i++){
			 if(res[i]<5)
				 move[i]=9-res[i];
			 else
				 move[i]=res[i];
		 }
		 for(int i=0;i<6;i++){
			 System.out.println("第"+i+"位偏移量是"+move[i]);
		 }
		 //给偏移数组排个序
		 int temp=0;
    	 for(int i=0;i<move.length;i++){// 遍历每一个数
    		 for(int j=i+1;j<move.length;j++){//  遍历这个数之外的数
    			 if(move[i]<move[j]){
    				 temp=move[i];
    				 move[i]=move[j];
    				 move[j]=temp;
    			 }
    		 }
    	 }
    	 for(int i=0;i<6;i++){
    		 System.out.println("排序后第"+i+"位的偏移量是"+move[i]);
    	 }
		 //如果前半部分和后半部分相等
		 if(last==first)
			 System.out.println(0);
		 else{
			 //相差的差值(正数)
			 int cur=Math.abs(first-last);
			 System.out.println("两者相差"+cur);
			 int j=0;
			 //遍历偏移量
			 for(int i=0;i<6;i++){
    		      cur=cur-move[i];
    		      j++;
    		      if(cur<=0){
    		    	  break;
    		      }
    	    }
			 System.out.println(j);
		 }
	     
	}
}
