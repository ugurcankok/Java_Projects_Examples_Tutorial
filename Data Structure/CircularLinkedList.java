package CircularLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {
	
	private ListNode last;
	private int length;
	
	private class ListNode{
		
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public CircularLinkedList(){
		last=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void CreateList() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(5);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(15);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
		
	}
	
	public void display() {
		if(last==null) {
			return;
		}
		
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data +" -> ");
			first=first.next;
		}
		System.out.print(first.data);
	}
	
	public void InsertFirst(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
			last=temp;
		}else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
		
	}
	
	public void insetLast(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
			last=temp;
			last.next=last;
		}else {
			temp.next=last.next;
			last.next=temp;
			last=temp; 
		}
		length++;
	}
	
	public ListNode removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException("Circular LinkList already empty!!");
		}
		
		ListNode temp=last.next;
		
		if(last.next==last) {
			last=null;
		}else {
			last.next=temp.next;
		}
		
		temp.next=null;
		length--;
		 return temp;
	}
	
	public static void main(String[] args) {
		CircularLinkedList circular=new CircularLinkedList();
		//circular.CreateList();
		//circular.InsertFirst(10);
		//circular.InsertFirst(11);
		circular.insetLast(1);
		circular.insetLast(2);
		circular.insetLast(3);
		
		circular.removeFirst();
		
		
		circular.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
