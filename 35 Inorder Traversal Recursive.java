class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> output_arr=new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            output_arr.add(root.data);
            inOrder(root.right);
        }
        return output_arr;
    }
}
