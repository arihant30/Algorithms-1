class Solution {
    int binarysearch(int arr[], int n, int k){
        int first=0; int last=n-1; int mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]<k)
                first=mid+1;
            else if(arr[mid]>k)
                last=mid-1;
                
        }
        return -1;
    }
}
