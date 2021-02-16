/*
Input
                1
              /   \
             2    2
            /\    /\
           4  5  6  8
             /
            8
 LINKEDLIST=8->5->2->1
output=['L','R','L'];

*/

import java.util.*;
class Node
{
	int key;
	Node left, right;
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
class leftrightwalla
{
	Node root;
	BinaryTree(int key)
	{
		root = new Node(key);
	}
	BinaryTree()
	{
		root = null;
	}
	static String h="";
static void x(Node x111,LinkedList<Integer> p)
{
    Collections.reverse(p);
    x1(x111,p,"",0);
    List<Character> r=new LinkedList<>();
    char t[]=h.toCharArray();
    for(int i=0;i<t.length-1;i++)
    {
        r.add(t[i]);
    }
    System.out.println(r);
}
static Node x1(Node x,LinkedList<Integer> p,String w,int k)
{
   if(x==null)
   {
       if(k==p.size()&&h.length()==0)
       {
           h=w;
           return x;
       }
       return null;
   }
   if(x.key!=p.get(k))
   {
      return  x;
   }
   x1(x.left,p,w+"L",k+1 );
   x1(x.right,p,w+"R",k+1);
   return x;
}
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(8);
			tree.root.left.right.left = new Node(8);
			LinkedList<Integer> li=new LinkedList<>();
			li.add(4);
			li.add(2);
			li.add(1);
			x(tree.root,li);
	}
}
