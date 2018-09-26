package Algorithm;
/*
 * 笔试题碰到三次的求连续数组最大字串和
 * 
 *  两个变量  一个max存储最终结果
 *  一个add 用来判断具体情形  
 */
public class TheQThree {
    public static void main(String[] args) {
		//定义测试数组
    	int[] test=new int[]{1,-5,9,-6,8,8,-10,59}; //结果68
    	int max=0;
    	int add=0;
    	for(int i=0;i<test.length;i++){
    		if(test[i]>=0){
    			//大于0  加入add 
    			add=add+test[i];
    			max=add;
    			if(add>0){
        			if(max<add){
        				int temp=0;
        				temp=add;
        				add=max;
        				max=temp;    			
    		        } 
    			}
    			else 
    				add=0;
     
    		}else{
    			add=add+test[i];
    			if(add>0){
        			if(max<add){
        				int temp=0;
        				temp=add;
        				add=max;
        				max=temp;
        			
    		        } 
    			}
        			else
        				add=0;
    		}
    	
    	}
    	System.out.println(max);
	}
}
