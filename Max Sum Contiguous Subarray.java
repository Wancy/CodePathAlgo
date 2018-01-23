public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        List<Integer> sum = new ArrayList<>();		
        int add = 0;		
        for (int i = 0; i < A.size(); i++) {		
            add += A.get(i);		
            sum.add(add);		
        }		
        int result = Integer.MIN_VALUE;
        int min = 0;
        // -2,1,-3,4,-1,2,1,-5,4
        // -2,-1,-4,0,-1,1,2,-3,1
        for (int i = 0; i < sum.size(); i++) {	
            result = Math.max(sum.get(i) - min, result);		
            min = Math.min(min, sum.get(i));
        }		
        return result;
    }
}
