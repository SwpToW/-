package Algorithm;
/*
 * 两个有序链表合并成一个
 */
public class TwoListMerage {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	/*
	 * 合并方法，遍历B链表，直接插入
	 * 
	 * 两个while循环
	 */
    public ListNode Merge(ListNode list1,ListNode list2) {
    	
        while(list2.next!=null){
        	//依次获取链表2的每一个节点
        	int res=list2.val;
        	//开始循环链表1，找到待插入值应该插入的节点
        	while(list1.next!=null){
        		//找到插入点的前一个节点
        		if(res>list1.val||res<=list1.next.val){
        			//构造新的插入节点
        			ListNode k=new ListNode(res);
        			k.next=list1.next;
        			list1.next=k;       			
        		}
        		list1=list1.next;
        	}
        	list2=list2.next;//移动指针
        }
        return list1;
    }   
}
