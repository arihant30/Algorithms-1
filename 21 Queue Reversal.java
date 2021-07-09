class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Queue<Integer> qu=new LinkedList<>();
        Stack<Integer> stk=new Stack<>();
        for(int as: q){
            stk.push(as);
        }
        while(!stk.isEmpty()){
            qu.add(stk.pop());
        }
        return qu;
    }
}
