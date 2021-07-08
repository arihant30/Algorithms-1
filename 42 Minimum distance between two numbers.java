class Solution {
    int minDist(int a[], int n, int x, int y) {
        int actual_min=n;
        int index_i=2*n; int index_y=2*n;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                index_i=i;
                actual_min=Math.min(actual_min,Math.abs(index_i-index_y));
            }
            else if(a[i]==y){
                index_y=i;
                actual_min=Math.min(actual_min,Math.abs(index_i-index_y));
            }

        }
        if(index_i == 2*n || index_y==2*n)
            return -1;
        return actual_min;
    }
}
