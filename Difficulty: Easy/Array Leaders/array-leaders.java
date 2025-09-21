import java.util.ArrayList;
import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length-1];
        result.add(max);
        
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
