/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
        for(int i=1;i<ind;i++){
            node=node.next;
        }
        return node.data;
    }
}
