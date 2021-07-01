class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> union=new HashSet<>();
        int temp=0;
        int temp2=0;
        int count=0;
        while(temp<n){
            union.add(a[temp++]);
        }
        while(temp2<m){
            union.add(b[temp2++]);
        }
        return union.size();
        
    }
}
