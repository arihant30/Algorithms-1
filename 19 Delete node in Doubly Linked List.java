/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        Node temp=head;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.prev.next=null;
            return head;
        }
        if(temp.prev==null){
            if (temp.next == null) return null;
            head=temp.next;
            head.prev=null;
            
            return head;
        }
        Node nextnode=temp.next;
        Node prevnode=temp.prev;
        prevnode.next=nextnode;
        nextnode.prev=prevnode;
        return head;
    }
}
