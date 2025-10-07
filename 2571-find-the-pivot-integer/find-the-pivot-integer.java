class Solution {
    public int pivotInteger(int n) {
        int pivot=n;
        int total=(n*(n+1))/2;
        int r=0;
        while(pivot>0){
            int l=total-r;
            r+=pivot;
            if(l==r)
                return pivot;
            pivot--;
        }
        return -1;
    }
}