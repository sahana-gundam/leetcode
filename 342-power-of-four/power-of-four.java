class Solution {
    public boolean isPowerOfFour(int n) {
        long next=4;
        int current = 0;
        while(next <= Integer.MAX_VALUE){
            current = (int)next;
             next = next * 4;
        }
        return n>0 && current%n==0 && Math.sqrt(n)%1==0;
    }
}