class Tree
{
    //Function to find the minimum element in the given BST.
    int minValue(Node node)
    {
        Node min=node;
        if(min==null){
            return -1;
        }
        while(min.left!=null){
            min=min.left;
        }
        return min.data;
    }
}
