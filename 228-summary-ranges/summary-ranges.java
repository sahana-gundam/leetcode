class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        List<String> ans = new ArrayList<>();
        while(i<nums.length){
            int start = nums[i];
            int end = nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1){
                end = nums[i+1];
                i++;
            }
            if(start!=end){ 
            ans.add(start+"->"+end);
        }else{
            ans.add(String.valueOf(start));
        }
        i++;
    }
    return ans;
    }
}