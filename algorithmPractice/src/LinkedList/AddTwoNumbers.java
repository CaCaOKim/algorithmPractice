package LinkedList;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}//ListNode END
}//ListNode END

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(2);
		
		ListNode node = solve(l1, l2);   //target: 7 0 6
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}//while END
		
		
		int a = 3;
		int b = a;
		
		a = 187;
		
		System.out.println(b);
	}//main() END

	private static ListNode solve(ListNode l1, ListNode l2) {
		int temp = 0;
		ListNode result = new ListNode(0);
		ListNode l1c = l1,  l2c = l2,  resultc = result;
		
		while(l1c!=null || l2c!=null) {
			
			if(l1c!=null) {
				temp += l1c.val;
				l1c = l1c.next;
			}//if END
				
			if(l2c!=null) {
				temp += l2c.val;
				l2c = l2c.next;
			}//if END
			
			resultc.next = new ListNode(temp%10);
			temp /= 10;
			resultc = resultc.next;
			
		}//while END
		
		if(temp>0) {resultc.next = new ListNode(temp);}//if END
		
		return result.next;
	}//solve() END

}//AddTwoNumbers END
