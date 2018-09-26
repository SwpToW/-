package Algorithm;
/*
 *  做一些递归操作
 */
public class Recusion {
	 public static void main(String[] args) {
		System.out.println(function1(8));
	}
     public static int function1(int n){
    	 //第1个人10，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？
    	 if(n==1)
    		 return 10;
    	 return function1(n-1)+2;
     }
}
