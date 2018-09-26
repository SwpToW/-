package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 *  整数数组转成最小字符串排序
 *  
 *  
 *  //将所有数字存入ArrayList中， 使用collections.sort方法重写比较器进行排序
 */
public class MinNumQueue {
	public static void main(String[] args) {
		System.out.println(PrintMinNumber(new int[]{12,65,94,1}));
	}
    public static String PrintMinNumber(int [] numbers) {
         ArrayList<Integer> res=new ArrayList<Integer>();//结果集，最后要进行拼接
         StringBuffer sb=new StringBuffer("");
         for(int i=0;i<numbers.length;i++){
        	 res.add(numbers[i]);
         }
         Collections.sort(res, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				String s1=o1+""+o2;
				String s2=o2+""+o1;
				return s1.compareTo(s2);
			}
        	 
		});
    
        for(int i: res){
        	sb.append(i+"");
        }
        return sb.toString();
        
    }
}
