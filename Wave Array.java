public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i = 1; i < A.size(); i+=2) {
            int prev = A.get(i - 1);
            A.set(i - 1, A.get(i));
            A.set(i, prev);
            
        }
        return A;
    }
}
