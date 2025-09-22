
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int sum = 0;
        
        for(int j = 0;j<arr.length;j++){
            sum += arr[j];
            
            while(sum > target && i <= j){
            sum -= arr[i];
            i++;
        }
        
        if(sum == target){
            result.add(i+1);
            result.add(j+1);
            return result;
            }
        }
        
        result.add(-1);
        return result;
    }
}
