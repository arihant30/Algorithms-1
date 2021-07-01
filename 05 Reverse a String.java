class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuilder reverse1=new StringBuilder(str);
        reverse1.reverse();
        return reverse1.toString();
    }
}
