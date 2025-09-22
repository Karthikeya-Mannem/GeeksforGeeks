class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        
        if(n1 != n2){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i < n1 && j <n2){
            if(a[i] != b[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}