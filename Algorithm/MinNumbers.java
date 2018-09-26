package Algorithm;

import java.util.ArrayList;

/*
 *  给定数组 和数字K ，输出数组中最小的K个数字
 *  
 *  
 * 
 */
public class MinNumbers {
	public static void main(String[] args) {
		int[] n=new int[]{1,5,6,8,3,4,2};
		int k=10;
		System.out.println(MinNumbers.GetLeastNumbers_Solution(n, k));
	}
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] K, int k) {
    	 ArrayList<Integer> res=new ArrayList<Integer>();
    	if(k>K.length){
    		return res;
    	}
         int Max_K=0;//  K串中最大的那个数字,先假定为第一个数
     
         //初始四个数字放入K串中,并且求出K串中最大的数所在下标
         for(int i=0;i<k;i++){
        	 System.out.println("test1");
        	 if(K[i]>K[Max_K]){
        		 Max_K=i;
        	 }
        	 
         }
         
         for(int i=k;i<K.length;i++){
        	 //如果往后的数字小于K串中的最大数，先交换最大数和K[i],重新计算K串中的最大数
        	 System.out.println(i);
        	 if(K[i]<K[Max_K]){
        		 Swap(K,i,Max_K);
        		 for(int j=0;j<k;j++){
        			 System.out.println("test2");
                	 if(K[j]>K[Max_K])
                		 Max_K=j;	 
                 }
        	 }
         }       
         //结果
         for(int i=0;i<k;i++){
        	res.add(K[i]);
         }
         return res;
    }

	private static void Swap(int[] K,int i, int max_K) {
		int temp=0;
		temp=K[i];
		K[i]=K[max_K];
		K[max_K]=temp;
		
	}
}
