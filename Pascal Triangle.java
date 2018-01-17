public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int A) {
        if (A < 1) return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(1);
        result.add(row);
        if (A == 1) {
            return result;
        }
        for (int i = 1; i < A; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }
}
