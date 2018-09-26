package Algorithm;

public class removetElements2 {
public ListNode remove(ListNode head,int val){
	
	    ListNode dummyhead=new ListNode(-1);//虚拟头节点
	    dummyhead.next=head;
	
		ListNode prev=dummyhead;
		//这样就能遍历到真实的头节点，不需要单独处理头节点
		while(prev.next!=null){ //头节点的下一个节点不为空，说明没有遍历完链表
			if(prev.next.val==val){ //查找需要删除的节点的头一个节点
				ListNode delNode=prev.next; 
				prev.next=delNode.next;//将头一个节点的指针指向要删除的节点的后一个节点
				delNode.next=null;
				
			}else
				prev=prev.next;
		}
		return dummyhead.next;
	    
	}
}
