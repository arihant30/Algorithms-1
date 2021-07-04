class MyStack 
{
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode newnode=new StackNode(a);
        newnode.next=top;
        top=newnode;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        if(top==null){
            return -1;
        }
        else{
            StackNode temp=top;
            int x=temp.data;
            top=top.next;
            temp.next=null;
            return x;
        }
    }
}
