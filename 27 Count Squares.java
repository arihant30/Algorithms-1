class Solution {
    static int countSquares(int N) {
        int num=1;
        int count=0;
        while(num*num<N){
            count++;
            num++;
        }
        return count;
    }
};
