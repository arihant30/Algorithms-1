class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode newnode=new QueueNode(a);
        if(front==null || rear==null){
            front=rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if(front==null || rear==null){
            return -1;
        }
        else{
            int x=front.data;
            front=front.next;
            return x;
        }
	}
}
