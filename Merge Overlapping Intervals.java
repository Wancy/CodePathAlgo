public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        if (intervals == null || intervals.size() <= 0) return result;
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;        
            }
        });
        int preS = intervals.get(0).start;
        int preE = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (preE >= intervals.get(i).start) {
                preE = Math.max(intervals.get(i).end, preE);
            } else {
                result.add(new Interval(preS, preE));
                preS = intervals.get(i).start;
                preE = intervals.get(i).end;
            }
        }
        result.add(new Interval(preS, preE));
        return result;
    }
}
