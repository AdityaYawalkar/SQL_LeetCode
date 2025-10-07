class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int currentmax=0;
        for (int i=0;i<gain.length;i++) {
            currentmax+=gain[i];
            max=Math.max(max,currentmax);
        }
        return max;
    }
}