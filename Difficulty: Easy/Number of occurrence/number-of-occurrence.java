class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int p = 0;
        int count = 0;
        while(p < arr.length){
            if(arr[p] == target){
                count++;
            }
            p++;
        }
        return count;
    }
}
