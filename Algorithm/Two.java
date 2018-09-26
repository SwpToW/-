package Algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/*
 * 局长有N种食物，每种食物有Ai份。

每天局长会吃一份食物，或者买一份食物（即每天只能进行吃或买其中的一种动作），这样过了M天

现在局长想知道M天后第p种食物的份数排名（从大到小，相同算并列，例如3 3 2，则排名为1 1 3）
 
    第一行数据 N M P  
    
  第二行数据 N 个 代表每种食物的初始数量                                   //这里是测试用例
                                          3 3 1
  接下来第M 行数据 比如                                                                   2 2 2
                                          A 1
                                          B 2
                                          A 1           结果输出第1种食物的排名为 1(实际排名为1 3 2)
  A 1    表示买进第一种食物
  B 2    食用第二种食物
  A 3    买进第三种食物

    N,M,P<=100,Ai<=1000
 */
public class Two {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//结果存储,第一个表示第几种食物，第二个表示食物个数
	LinkedHashMap<Integer, Integer> res=new LinkedHashMap<>();
	//两个栈，A数组记录买进操作，B数组记录食用操作;
	Stack<Integer> A=new Stack<>();
	Stack<Integer> B=new Stack<>();
	// 第一行：输入三个数： 第一个 N 表示有多少种食物，第二个 M 表示过了多少天 ，第三个 P 第P种食物
    int N=sc.nextInt();
    int M=sc.nextInt();
    int P=sc.nextInt();
    //第二行 ，输入食物的多少 按顺序
	int[] num=new int[N];
	for(int i=0;i<N;i++){
		num[i]=sc.nextInt();
	}
	//第M行，输入操作。 A i 表示买进 第i种食物，B i表示食用第i种食物
	String[] cur=new String[M];
	for(int i=0;i<M;i++){
		cur[i]=sc.nextLine();
		if(cur[i].charAt(0)=='A')
			A.push((int)cur[i].charAt(2)-48);
		else
			B.push((int)cur[i].charAt(2)-48);
    }
	//初始化 Map
	for(int i=0;i<N;i++){
		res.put(i, num[i]);
	}
	//执行M天吃或者减的操作
    while(!A.isEmpty()){
    	int c=A.pop();
    	res.put(c,res.get(c)+1);
    }
    while(!B.isEmpty()){
    	int b=B.pop();
    	res.put(b, res.get(b)-1);
    }
    //执行完后对Map执行排序操作 ?? 怎么对Map的Value进行排序操作
	//用set集合存储到map的 键值映射
    Set<Entry<Integer,Integer>>  entrySet=res.entrySet();
    ArrayList<Entry<Integer, Integer>> list=new ArrayList<Entry<Integer,Integer>>(entrySet);
    Collections.sort(list, new Comparator<Entry<Integer,Integer>>(){

		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {			
			return o2.getValue()-o1.getValue();
		}
    	
    });
    //用新的HashMap存储到 比较后的Entry<Integer,Integer>.
	
}
}
