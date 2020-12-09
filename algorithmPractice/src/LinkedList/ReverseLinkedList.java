package LinkedList;

//class ListNode{   //AddTwoNumber에서 이미 정의함
//int val;
//ListNode next;
//ListNode(int x){
//	this.val = x;
//}//ListNode() END
//}//ListNode END

public class ReverseLinkedList {

	public static void main(String[] args) {
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(3);
//		//target: 3 2 1
		
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(0);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(1);
		l1.next.next.next.next.next = new ListNode(0);
		//target: 0 1 9 0 2 9
		
		printNode(l1);
		ListNode head = reverseList(l1);
		printNode(head);
	}//main() END

	private static ListNode reverseList(ListNode node) {
		ListNode prev = null;
		ListNode next = null;
		
		while(node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}//while END
		
		return prev;
	}//reverseList() END

	private static void printNode(ListNode node) {
		System.out.println("printNOde: ");
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}//while END
		System.out.println();
	}//printNode() END

}//ReverseLinkedList END
