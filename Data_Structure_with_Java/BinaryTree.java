package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data; 
		
		public TreeNode(int data) {
			this.data=data;
		}
		
	}
	
	public void createBinaryTree() {
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		
		root=first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		
	}
	
	//recursive
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//iterative
	public void preOrder2() {
		if(root==null) {
			return;
		}
		
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp=stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			
			if(temp.left!=null) {
				stack.push(temp.left);
			}
			
		}
	}
	
	//recursive
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	//iterative
	public void inOrder2() {
		if(root==null) {
			return;
		}
		Stack<TreeNode> stack=new Stack<>();
		TreeNode temp=root;
		while(!stack.isEmpty() || temp!=null) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}else {
				temp=stack.pop();
				System.out.print(temp.data + " ");
				temp=temp.right;
			}
		}
	}
	
	//recursive
	public void postOrder(TreeNode root){
		if(root==null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	//level order
	public void levelOrder() {
		if(root==null) {
			return;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left!=null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		//bt.inOrder(bt.root);
		//bt.inOrder2();
		//bt.postOrder(bt.root);
		bt.levelOrder();
		

	}

}
