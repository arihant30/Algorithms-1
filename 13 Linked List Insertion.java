class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
        }
        else{
        newnode.next=head;
        head=newnode;
        }
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node endnode=new Node(x);
        Node temp=head;
        if(head==null){
            head=endnode;
            endnode.next=null;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=endnode;
            endnode.next=null;
            
        }
        return head;
    }
}
