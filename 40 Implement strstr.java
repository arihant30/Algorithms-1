class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       if(x.length()==0)
            return 0;
        for(int i=0;i<s.length();i++){
            int j=0;
            for(;j<x.length()&&(i+j)<s.length();j++){
                if(s.charAt(i+j)==x.charAt(j)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(j==x.length()){
                return i;
            }
        }
        return -1;
    }
}
