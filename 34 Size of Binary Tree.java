/*Complete The Function Below*/
class Tree
{
	public static int getSize(Node root)
	{
        if(root==null)
            return 0;
        return getSize(root.left)+getSize(root.right)+1;
    }
}
