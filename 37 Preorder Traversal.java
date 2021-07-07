class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static void recursive(Node root, ArrayList<Integer> output_arr){
        if(root==null){
            return;
        }
        output_arr.add(root.data);
        recursive(root.left,output_arr);
        recursive(root.right,output_arr);

    }
    
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> output_arr=new ArrayList<>();
        recursive(root, output_arr);
        return output_arr;
    }

}
