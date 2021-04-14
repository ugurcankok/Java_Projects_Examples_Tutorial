package LinkedListt;
import java.util.*;

@SuppressWarnings("unused")
public class Test {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}	
	}
	
	//given a listnode ,print all elemnt in the list
	public void display(ListNode head) {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.print(current);
	}
	
	public int lenght(ListNode head) {
		if(head==null) {
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	
	public ListNode InsertBegin(ListNode head, int data) {
		ListNode newnode=new ListNode(data);
		if(head==null) {
			return newnode;
		}
		
		newnode.next=head;
		head=newnode;
		return head;//this head will be new head
	}
	
	public ListNode InsertEnd(ListNode head,int data) {
		ListNode lastnode=new ListNode(data);
		
		if(head==null) {
			return lastnode;
		}
		ListNode current=head;
		
		while(current.next != null) {
			current=current.next;
		}
		current.next=lastnode;
		return head ;
	}
	
	public void InsertAfter(ListNode previous,int data) {
		
		if(previous==null) {
			System.out.println("The previous node cannot be null.");
			return;
		}
		
		ListNode newNode=new ListNode(data);
		newNode.next=previous.next;
		previous.next=newNode;
	}
	
	public ListNode InserAtPosition(ListNode head,int data, int position) {
		int size=lenght(head);
		if(position > size+1 || position < 1 ) {
			System.out.println("The position is invalid!!");
			return head;
		}
		
		ListNode newNode=new ListNode(data);
		
		if(position==1) {
			newNode.next=head;
			return head;
		}else {
			ListNode previous=head;
			int count=1;
			while(count < position -1 ) {
				previous=previous.next;
				count++;
			}
			
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
			return newNode;
		}
	}
	
	public ListNode DeleteHead(ListNode head) {
		if(head==null) {
			return head;
		}
		
		ListNode temp=head;
		head=head.next; 
		temp.next=null;
		return temp;
		
	}
	
	public ListNode DeleteLast(ListNode head) {
		if(head==null) {
			return head;
		}
		
		ListNode last=head;
		ListNode previousToLast=null;
		
		while(last.next != null) {
			previousToLast=last;
			last=last.next;
		}
		
		previousToLast.next=null;
		return last;
	}
	
	public ListNode DeleteAtPosition(ListNode head, int position) {
		int size=lenght(head);
		if(position >size  || position < 1) {
			System.out.println("\nInvalid position");
			return head;
		}
		
		if(position ==1) {
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			return temp;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			
			ListNode current=head;
			previous.next=current.next;
			current.next=null;
			return current;
		}
		
	}
	
	public boolean find(ListNode head, int searchElement) {
		if(head==null) {
			return false;
		}
		
		ListNode current=head;
		while(current != null) {
			if(current.data == searchElement) {
				return true;
			}
			current=current.next;
			
		}
		return false;
	}
	
	public ListNode reverse(ListNode head) {
		if(head==null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		
		return previous;
	}
	
	public ListNode middleNode(ListNode head) {
		if(head== null) {
			return null;
		}
		
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		
		return slowPtr;
	}
	
	public ListNode getNthFromEnd(ListNode head,int n) {
		if(head==null) {
			return null;
		}
		if(n<=0) {
			throw new IllegalArgumentException("Invalid value n: " +n);
		}
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count=0;
		
		while(count<n) {
			if(refPtr==null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes list");
				
			}
			refPtr=refPtr.next;
			count++;
		}
		
		while(refPtr !=null) {
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
	public void removeDuplicate(ListNode head) {
		if(head==null) {
			return ;
		}
		ListNode current=head;
		while(current !=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
	}
	
	public ListNode InserInSortedLsıt(ListNode head, int value) {
		ListNode newNode=new ListNode(value);
		
		if(head==null) {
			return newNode;
		}
		ListNode current=head;
		ListNode temp=null;
		while(current != null && current.data<newNode.data) {
			temp=current;
			current=current.next;
		}
		
		newNode.next=current;
		temp.next=newNode;
		return head;
		
	}
	
	public void deleteNode(ListNode head,int key) {
		ListNode current=head;
		ListNode temp=null;
		if(current!=null && current.data == key) {
			head=current.next;
			return;
		}
		while(current != null && current.data != key) {
			temp=current;
			current=current.next;
		}
		
		if(current==null) {
			return;
		}
		temp.next=current.next;
	}
	
	public boolean containsLoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr!=null && fastPtr.next != null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	public void createALoop() {
		
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		ListNode sixth=new ListNode(6);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
		
		
	}

	public static void main(String[] args) {
		//Linked list is a data structure used for collecting element or object, it contains sequence of nodes first node is head and node has data and refers to the other node 
		//and the final node refer null
		ListNode head=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		
		Test singlyLinkList=new Test();
		singlyLinkList.display(head);
		singlyLinkList.createALoop();
		System.out.println(singlyLinkList.containsLoop());
		System.out.println("\nLength of list: " + singlylinklist.lenght(head));
		
		ListNode newHead=singlylinklist.InsertBegin(head, 15);
		singlylinklist.display(newHead);
		System.out.println("\nLength of list: " + singlylinklist.lenght(newHead));
		
		ListNode lastHead=singlylinklist.InsertEnd(newHead, 2);
		singlylinklist.display(lastHead);
		System.out.println("\nLength of list: " + singlylinklist.lenght(lastHead));
		
		singlylinklist.InsertAfter(second, 4);
		singlylinklist.display(newHead);
		System.out.println("\nLength of list: " + singlylinklist.lenght(newHead));
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your new data:");
		int value=input.nextInt();
		System.out.print("Enter your data position:");
		int position=input.nextInt();
		
		
		singlylinklist.InserAtPosition(newHead, 7, 3);
		singlylinklist.display(newHead);
		System.out.println("\nLength of list: " + singlylinklist.lenght(newHead));
		
		ListNode deleteNode=singlylinklist.DeleteHead(newHead);
		singlylinklist.display(newHead);
		System.out.println("\nLength of list: " + singlylinklist.lenght(head));
		
		ListNode deleteLastNode=singlylinklist.DeleteLast(head);
		System.out.print(deleteLastNode.data);
		System.out.println("\nLength of list: " + singlylinklist.lenght(head));
		
		ListNode deletePosition=singlylinklist.DeleteAtPosition(head, 3);
		System.out.println("\n" + deletePosition.data);
		
		if(singlyLinkList.find(head, 18)) {
			System.out.println("\nElement was found");
		}else {
			System.out.println("\nElement could not be found!!");
		}
		
		ListNode reverseList=singlyLinkList.reverse(head);
		singlyLinkList.display(reverseList);
		
		ListNode middleNode=singlyLinkList.middleNode(head);
		System.out.println("Middle node is: " + middleNode.data);
		
		ListNode nthNodeFromEnd=singlyLinkList.getNthFromEnd(head, 2);
		System.out.println("Nth node from n is: " + nthNodeFromEnd.data);
		
		singlyLinkList.removeDuplicate(head);
		singlyLinkList.display(head);
		
		singlyLinkList.InserInSortedLsıt(head, 3);
		singlyLinkList.display(head);
		
		singlyLinkList.deleteNode(head, 2);
		singlyLinkList.display(head);
		
		
	}

}
