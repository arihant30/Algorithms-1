class Solution {
    
    public Node insertInMid(Node head, int data){
        Node newnode=new Node(data);   
        if(head==null)
            head=newnode;
        
        Node slow,fast,headnode;
        slow = fast = headnode = head;
        
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        newnode.next=slow.next;
        slow.next=newnode;
        
        return head;
        
    }
}
