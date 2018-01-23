public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String result = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            result = commonPrefix(result, A.get(i));
        }
        return result;
    }
    
    private String commonPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        String result = "";
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result += str1.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }
}
