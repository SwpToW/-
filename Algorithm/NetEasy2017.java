package Algorithm;
/*
 * rev 反转
 * 
 * 321 反转成123  100反转之后001去掉前导0
 */
public class NetEasy2017 {
	public static void main(String[] args) {
		System.out.println(rev(rev(322)+rev(100)));
	}
   public static int rev(Integer r){
	   String s=r.toString();
	    StringBuffer sb=new StringBuffer(s);
	    sb.reverse();
	    int i=0;
	    while(sb.charAt(i)==0){
	    	sb.deleteCharAt(i);
	    	i++;
	    }
	    String result=sb.toString();
	    int x=Integer.parseInt(result);
	return x;
   }
}
