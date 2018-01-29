public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            char[] chars = A.get(i).toCharArray();
            Arrays.sort(chars);
            String a = new String(chars);
            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<Integer>());
            }
            map.get(a).add(i + 1);
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
