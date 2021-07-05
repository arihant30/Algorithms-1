class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
        if(front!=0 && rear !=0 && front>rear){
            return;
        }
        else{
            arr[rear++]=x;
        }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
    if(front>= rear)
		    return -1;
    else
        {
		    int temp=arr[front++];
		    return temp;
		}

	} 
}
