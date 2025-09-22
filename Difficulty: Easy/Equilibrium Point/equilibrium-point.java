class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int rsum = 0;
        for(int i = 0;i<arr.length;i++){
            rsum += arr[i];
        }
        int lsum = 0;
        for(int j = 0;j<arr.length;j++){
            rsum -= arr[j];
            if(lsum == rsum){
                return j;
            }
            lsum += arr[j];
        }
        
        return -1;
    }
}
