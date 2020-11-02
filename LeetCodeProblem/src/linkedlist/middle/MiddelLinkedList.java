package linkedlist.middle;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

}

public class MiddelLinkedList {

	public static ListNode createLinkedList(int[] values) {

		ListNode head = new ListNode(values[0], null);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			ListNode other = new ListNode(values[i], null);
			while (current.next != null) {
				current = current.next;
			}
			current.next = other;
		}
		return head;
	}

	public static ListNode middleNode(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static void main(String[] args) {

		int[] input = new int[] { 1, 2, 3, 4, 5 };
		ListNode head = createLinkedList(input);
		ListNode middle = middleNode(head);
		System.out.println(middle);

		int[] input2 = new int[] { 1, 2, 3, 4, 5, 6 };
		ListNode head2 = createLinkedList(input2);
		ListNode middle2 = middleNode(head2);
		System.out.println(middle2);

	}

}
