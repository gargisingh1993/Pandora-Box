class ListNode {
      int data;
      ListNode next;
      void add(int x) 
      { 
    	  data = x; 
      }
  }

public class mergetwosortedlist {
	public static void main(String args[]){
		ListNode list1 = new ListNode();
		ListNode list2 = new ListNode();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		System.out.println(Mergelists(list1,list2));
	}
	static ListNode Mergelists(ListNode list1,ListNode list2){
		ListNode head;
		if(list1.data<list2.data){
			head = list1;
		}
		else{
			head =list2;
			list2 = list1;
			list1 = head;
		}
		while(list1.next != null && list2 != null){
			if(list1.next.data > list2.data){
				ListNode temp = list1.next;
				list2.next = temp;
			}
			list1 = list1.next;
		}
		if(list1.next == null)
			list1.next = list2;
		return head;
	}
}
