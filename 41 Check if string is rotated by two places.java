class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        int len1=str1.length();
        if(len1 != str2.length())
            return false;
        if(len1==1)
            return str1.equals(str2);
        return (str1.substring(2)+str1.substring(0,2)).equals(str2) || (str2.substring(2)+str2.substring(0,2)).equals(str1);
    }
    
}
