class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> output_arr=new ArrayList<>();
    ArrayList<Integer> postOrder(Node root)
    {
       if(root==null){
           return output_arr;
       }
       postOrder(root.left);
       postOrder(root.right);
       output_arr.add(root.data);
       return output_arr;
    }
}
