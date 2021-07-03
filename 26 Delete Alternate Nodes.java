class Solution {
    
    public void deleteAlternate (Node head){
        Node temp=head;
        while(temp.next != null && temp.next.next !=null ){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        temp.next = null;
    }
}
