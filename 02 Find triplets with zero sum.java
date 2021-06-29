class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                if(arr[i]+arr[low]+arr[high]==0) return true;
                else if(arr[i]+arr[low]+arr[high]<0) low++;
                else high--;
            }
    }
    return false;
    }
}    
    
