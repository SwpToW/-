package Algorithm;

import java.util.Scanner;

/*
 *   输入三个数A B C 
 *   选择N个数字(N>=1)   这N个数字必须是A的倍数
 *   是否存在方案 使得这些数字的和对B取余的结果为C 
 *   有输出YES ，无则输出NO
 *   
 *       */
public class Tencent {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] num=new int[sc.nextInt()][3];
		//初始化二维数组，一维代表多少组数据，二维代表A ,B,C
		for(int i=0;i<num.length;i++){
		   for(int j=0;j<3;j++){
			   num[i][j]=sc.nextInt();
		   }
		}
		for(int i=0;i<num.length;i++){
			YorN(num[i][0],num[i][1],num[i][2]);
		}
		//这些数字必须是N的倍数的话他们的和也是N的倍数
	
	  }
      private static void YorN(int A,int B,int C){
    	int N=0;
  		while((N*A)%B!=C){
  			if(N>=A)//临界条件提升到A的三倍通过率达到百分之六十
  				break;
  			N++;
  		}
  		if(N>=A)
  			System.out.println("NO");
  		else
  		 System.out.println("YES");
      }
}
