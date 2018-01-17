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
        for (int i = 0; i < sum.size(); i++) {
            result = Math.max(sum.get(i), result);
            for (int j = 0; j < i; j++) {
                result = Math.max(result, sum.get(i) - sum.get(j));
            }
        }
        return result;
    }
}
