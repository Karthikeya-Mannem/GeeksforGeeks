class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        result.add(arr[i]);
        for(int j = 1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                result.add(arr[i+1]);
                i++;
            }
        }
        return result;
    }
}
