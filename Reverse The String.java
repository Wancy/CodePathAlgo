public class Solution {
	public String reverseWords(String a) {
	    if (a == null || a.length() == 0) return a;
        String[] words = a.trim().split(" +");
        if (words.length == 0) return "";
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
	}
}
