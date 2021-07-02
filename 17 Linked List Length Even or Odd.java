/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 1 if the length of LL is even 
   otherwise return 0.*/
class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    int count=0;
	    while(head1 != null){
	        head1=head1.next;
	        count++;
	    }
	    if(count%2==0) return 0;
	    return 1;
	}
}
