class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
    ArrayList<Integer> output_arr=new ArrayList<>();
    if(root==null){
        return null;
    }
    Stack<Node> stack=new Stack<>();
    stack.add(root);
    
    while(!stack.isEmpty()){
        Node currentnode=stack.pop();
        output_arr.add(currentnode.data);
        if(currentnode.right!=null){
            stack.add(currentnode.right);
        }
        if(currentnode.left!=null){
            stack.add(currentnode.left);
        }
        
    }
    return output_arr;
    }

}
