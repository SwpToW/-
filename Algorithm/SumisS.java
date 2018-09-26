package Algorithm;

import java.util.ArrayList;

/*
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 输出两个数，小的先输出
 * 
 * 关键在于递增，  肯定是头尾部分相加等于S
 * 
 * 设两个头尾指针 i,j
 * 如果a[i]+a[j]=S   输出i j
 * 如果 a[i]+a[j] <S i++  因为i会越来越大
 * 如果 a[i]+a[j] >S j--  因为j会越来越小
 */
public class SumisS {
    public ArrayList<Integer> FindNumbersWithSum(int [] a,int sum) {
        
    	ArrayList<Integer> arr=new ArrayList<>();
    	int i=0;
    	int j=a.length-1;
    	while(i!=j){
    		if(a[i]+a[j]==sum){
    			arr.add(i);
    			arr.add(j);
    		}
    		while(i<j && a[i]+a[j]<sum)
    			i++;
    		while(i<j && a[i]+a[j]>sum)
    			j--;
    	}
    	return arr;
    }
}
