package Algorithm;

import java.util.ArrayList;
import java.util.List;

/*
 *  随机生成有效括号组，给出n代表括号的对数
 *  
 *  例如： 给出n=3
 *  返回
 *  [
    "((()))",
    "(()())",
    "(())()",
    "()(())",
    "()()()"
    ]
    
      先生成n个括号组合排列成不同的顺序，
       第一个肯定是左括号，最后一个肯定是右括号
       
    什么叫有效： 左右括号数目相等
    
     跟踪左右括号数目，当左括号少于右括号时，可以添加右括号
    
 */
public class Question2 {
    public List<String> generateParenthesis(int n) {
         ArrayList<String> res=new ArrayList<String>();
         BackTrack(res,"",0,0,n);        
         return res;
    }
    //回溯函数
	private void BackTrack(ArrayList<String> res,String cur, int open, int close, int n) {
		 if(cur.length()==n*2){
			 res.add(cur);
			 return;
		 }
		 //因为左括号数目一定有n个
		 if(open<n)
			 BackTrack(res, cur+"(", open+1, close, n);
		 //怎么保证随机
	     if(open>close)
	    	 BackTrack(res, cur+")", open, close+1, n);
		
	}
}
