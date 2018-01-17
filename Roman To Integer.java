public class Solution {
    public int romanToInt(String A) {
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        m1.put('I',1);
        m1.put('V',5);
        m1.put('X',10);
        m1.put('L',50);
        m1.put('C',100);
        m1.put('D',500);
        m1.put('M',1000);
        if (A.length() == 1) return m1.get(A.charAt(0));
        int sum = 0;
        char[] list = A.toCharArray();
        for (int i = 1; i < list.length; i++) {
            if (m1.get(list[i - 1]) < m1.get(list[i])) {
                sum += - m1.get(list[i - 1]);
            } else {
                sum += m1.get(list[i - 1]);
            }
        }
        sum += m1.get(A.charAt(list.length - 1));
        return sum;
    }
}
