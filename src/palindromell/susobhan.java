package palindromell;

import java.util.*;
class node{
	node next;
	int data;
	node(int data){
		this.data = data;
		next = null;
	}
}
     class linkedlist {
	node head;
	
	boolean  palindrome(node head) {
		node current = head;
		boolean isplan = true;
		Stack <Integer> stack = new Stack<Integer>();
		
		while(current!=null) {
			//push element in stack
			stack.push(current.data);
			current = current.next;
		}
		
		//ll empty nahi ho too
		while(head!=null) {
			//stack sa pop bala elemet linklist ka head sa same ho to asa kora same hota jaya to palindrome
			if(head.data==stack.pop()) {
				isplan =true;
				
			}else {
				isplan= false;
				break;
			}
			head = head.next;
		}
			
		
		return isplan;
	}
}
	
	
     public class susobhan {
	public static void main(String args[]) {
		linkedlist l = new linkedlist();
		node head = new node(1);
		head.next = new node(2);
		head.next = new node(1);
		
		System.out.println(l.palindrome(head));
		
		
	}

}
