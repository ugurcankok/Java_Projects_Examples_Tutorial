package DoubleLinkeListt;

import java.util.NoSuchElementException;

public class Test {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
		
	}

	public Test() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length == 0; //head is null
	}
	
	public int length() {
		return length;
	}
	
	public void displayForward() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp=temp.next;
		}
		System.out.print("null\n");
	}
	
	public void displayBackward() {
		if(tail==null) {
			return;
		}
		ListNode temp=tail;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp=temp.previous;
		}
		System.out.print("null\n");
	}
	
	public void InsertBegin(int value) {
		ListNode newNode=new ListNode(value);
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public  void InsertLast(int value) {
		ListNode newNode= new ListNode(value);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;	
			newNode.previous=tail;
		}	
		tail=newNode;
		length++;
		
	}
	
	public ListNode DeleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
			ListNode temp=head;
			if(head==tail) {
				tail=null;
			}else {
				head.next.previous=null;
			}
			head=head.next;
			temp.next=null;
			length--;
			return temp;
	}
	
	public ListNode DeleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp=tail;
		if(head==tail) {
			head=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp;
	}
	
	public static void  main(String[] args) {
		Test doublyLinkList=new Test();
		doublyLinkList.InsertBegin(2);
		doublyLinkList.InsertBegin(3);
		doublyLinkList.InsertLast(15);
		doublyLinkList.InsertLast(16);
		doublyLinkList.displayForward();
		doublyLinkList.DeleteFirst();
		doublyLinkList.DeleteLast();
		doublyLinkList.displayForward();		
		
	}	

}
