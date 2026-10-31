class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int n = score.length;
       int[][] scorewithindex = new int[n][2];
       for(int i=0;i<n;i++){
        scorewithindex[i][0] = score[i];
        scorewithindex[i][1] = i;
       }
       Arrays.sort(scorewithindex,(a,b)->Integer.compare(b[0],a[0]));
       for(int i=0;i<n;i++){
        int original = scorewithindex[i][1];
        if(i == 0){
            ans[original] = "Gold Medal";
        }else if(i == 1){
               ans[original] = "Silver Medal";
        }else if(i == 2){
               ans[original] = "Bronze Medal";
        }else{
            ans[original] = String.valueOf(i+1);
        }
       }
        return ans;
    }
}