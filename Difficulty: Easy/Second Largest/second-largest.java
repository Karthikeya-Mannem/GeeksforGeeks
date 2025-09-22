class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1 = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max1){
                max1 = arr[i];
            }
        }
        int max2 = Integer.MIN_VALUE;
        for(int j = 0;j<arr.length;j++){
            if(arr[j] > max2 && arr[j] != max1){
                max2 = arr[j];
            }
        }
        return max2 == Integer.MIN_VALUE ? -1 : max2;
    }
}