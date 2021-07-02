/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
        Node temp=head.next;
        if(head==null){
            return true;
        }
        while(temp!=null && temp!=head){
            temp=temp.next;
            
        }
        return (temp==head);

    }
}
