package Algorithm;
//删除链表的给定值
/*
 *   比如 1>4>6>8>6  给定值6
 *   返回新的链表 1>4>8
 */
public class removeElements{
	public ListNode remove(ListNode head,int val){
		
		//链表为空且头节点为给定值，就删除头节点，头节点往前移动
		while(head!=null&&head.val==val){
			ListNode delNode=head;
			head=head.next;
			delNode.next=null;
		}
		if(head==null)
			return null;
		ListNode prev=head;
		while(prev.next!=null){ //头节点的下一个节点不为空，说明没有遍历完链表
			if(prev.next.val==val){ //查找需要删除的节点的头一个节点
				ListNode delNode=prev.next; 
				prev.next=delNode.next;//将头一个节点的指针指向要删除的节点的后一个节点
				delNode.next=null;
				
			}else
				prev=prev.next;
		}
		return head;
	    
	}
}
