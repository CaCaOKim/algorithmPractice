package LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

//class ListNode{   //AddTwoNumber에서 이미 정의함
//	int val;
//	ListNode next;
//	ListNode(int x){
//		this.val = x;
//	}//ListNode END
//}//ListNode END

public class MergeKSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(5);
		l2.next.next.next = new ListNode(7);
		
		ListNode l3 = new ListNode(4);
		l3.next = new ListNode(6);
		//target: 0 1 2 2 4 4 5 6 7
		
		ListNode[] list = new ListNode[3];
		list[0] = l1;
		list[1] = l2;
		list[2] = l3;
		MergeKSortedList a = new MergeKSortedList();
		ListNode result = a.mergeKLists(list);
		while(result !=null) {
			System.out.println(result.val);
			result= result.next;
		}//while END
	}//main() END
	
	
	private ListNode mergeKLists(ListNode[] list) {
		if(list==null||list.length==0) {return null;}//if END
		
		Queue<ListNode> que = new PriorityQueue<ListNode>((a,b) -> a.val-b.val);
		ListNode result = new ListNode(0);
		ListNode virt = result;
		
		for(ListNode LN : list) {
			que.offer(LN);
		}//for END
		
		while(!que.isEmpty()) {
			ListNode LN = que.poll();
			virt.next = LN;
			virt = virt.next;
			if(LN.next!=null) {
				que.offer(LN.next);
			}//if END
		}//while END
		
		return result.next;
	}//mergeKLists() END

}//MergeKSortedList END
