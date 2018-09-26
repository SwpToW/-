package Algorithm;
/*
 * 尽可能的实现所有排序方法。
 */
public class Sort {
	
     public static void main(String[] args) {
		int[] x=new int[]{8,3,2,4,5,0,7,6,9,1};
		Sort3(x,0,x.length-1);
		
	}
     //冒泡排序
     public static void Sort1(int[] x){
    	 int temp=0;
    	 for(int i=0;i<x.length-1;i++){ //外层循环控制躺数
    		 for(int j=0;j<x.length-i-1;j++){  //内层循环控制每趟循环的比较次数
    			
    			 if(x[j]<x[j+1]){
    				 temp=x[j];
    				 x[j]=x[j+1];
    				 x[j+1]=temp;
    			 }
    		 }
    	 }
    	 show(x);
     }
     //选择排序
     public static void Sort2(int[] x){
    	 int temp=0;
    	 for(int i=0;i<x.length;i++){// 遍历每一个数
    		 for(int j=i+1;j<x.length;j++){//  遍历这个数之外的数
    			 if(x[i]<x[j]){
    				 temp=x[i];
    				 x[i]=x[j];
    				 x[j]=temp;
    			 }
    		 }
    	 }
    	 show(x);
     }
     //快速排序
     /*
      * 思想： 以基准值为界，分开两边， 左边比基准值小，右边比基准值大
      * 重复递归去调用自身
      */
     public static int QuickSort(int[] x,int low,int high){
    	 int key=x[low];//  左指针所在为基准值
    	 while(low<high){  //左右指针重合才能跳出循环
    		 while(x[high]>=key&&high>low){ //后半部分向前扫描  当右指针大于等于基准值并且右指针大于左指针时，右指针向左移动
    			 high--;  //当右指针小于基准值时，停止移动
    		 }
    		Swap(x[low], x[high]);  //交换
    		low++;
    		 while(x[low]<=key&&high>low){  //前半部分向后扫描 当左指针小于等于基准值并且右指针大于左指针时，左指针向右移动
    			 low++; //当左指针大于基准值时，停止移动
    		 }
    		Swap(x[low],x[high]); //交换
    		high--;
    	 }
    	 
    	 return x[high];//返回基准值所在位置
    	 
     }
     public static void Sort3(int[] x,int low,int high){
    	 if(low>high){
    		 show(x);
    		 
    	 }else{
    		 int pri=QuickSort(x,low,high);
    		 Sort3(x,low,pri-1);
    		 Sort3(x,pri+1,high);
    	 }
     }
     public static void Swap(int x,int y){
    	 int temp=0;
    	 temp=x;
    	 x=y;
    	 y=temp;
     }
     public static void show(int[] x){
    	 for(int s :x){
    		 System.out.print(s);
    	 }
     }
}
