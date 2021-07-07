class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        Stack<Node> stack=new Stack<>();
        ArrayList<Integer> output_arr=new ArrayList<>();
        if(root==null){
            return output_arr;
        }
        Node current=root;
        while(current !=null || !stack.isEmpty()){
            while(current!=null){ 

            stack.push(current);
            current=current.left;
                                    //reach the leftmost
        }
        current=stack.pop();
        output_arr.add(current.data);

        current=current.right;
        }
        return output_arr;
    }
}
