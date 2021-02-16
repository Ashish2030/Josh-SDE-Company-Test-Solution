/* 

sample input 
->1234567
sample output
->4352617

sample input 
->123456
sample output
->342516
*/
import java.util.*;
class ZigZag { 
	static Node head; 

	static class Node {
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	static Node zigzag(Node head)
	{
	    Node temp=head;
	    int count=0;
	    while(temp!=null)
	    {
	        count++;
	        temp=temp.next;
	    }
	    int arr[]=new int[count];
	    temp=head;
	    int k=0;
	    while(temp!=null)
	    {
	        arr[k++]=temp.data;
	        temp=temp.next;
	    }
	   
	    int flag=1;
	    int index=-1;
	    int start=0;
	    int end=0;
	    Node head2=null;
	    Node tail=null;
	    if(count%2==0)
	    {
	       index=(count/2)-1; 
	        //System.out.println(index);
	       start=index-1;
	       end=index+2;
	       head2=new Node(arr[index]);
	       head2.next=new Node(arr[index+1]);
	       tail=head2.next;
	    }
	    else
	    {
	        index=(count/2);
	        start=index-1;
	        end=index+1;
	         head2=new Node(arr[index]);
	         tail=head2;
	    }
	    while(start>=0)
	    {
	        tail.next=new Node(arr[start]);
	        tail.next.next=new Node(arr[end]);
	        tail=tail.next.next;
	        start--;
	        end++;
	    }
	    
	    return head2;
	}
	static void printx(Node z)
	{
	    Node t=z;
	    while(t!=null)
	    {
	        System.out.print(t.data+" ");
	        t=t.next;
	    }
	}

	public static void main(String[] args) 
	{ 
	
		LinkedList llist = new LinkedList(); 

		llist.head = new Node(1); 
		Node second = new Node(2); 
		Node third = new Node(3); 
		Node fourth=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		//	Node six1=new Node(7);
		llist.head.next = second; 
		second.next = third;
		third.next=fourth;
		fourth.next=five;
		five.next=six;
		//six.next=six1;
		System.out.println("question input");
		printx(head);
		System.out.println();
			System.out.println("solution output");
		printx(zigzag(head));
	} 
} 
