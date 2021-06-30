class Solution {
    int remove_duplicate(int A[],int N){
        int k=0;
        for(int i=1;i<N;i++){
            if(A[k]!=A[i]){
                A[++k]=A[i];
                
            }
            
        }
        return k+1;
    }
}
