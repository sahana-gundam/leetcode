class Solution {
    public boolean isPowerOfThree(int n) {
        int current = 1;
        long next = 3;
        while(next <=Integer.MAX_VALUE){
            current = (int)next;
            next *= 3;
        }
        int an = current;
        return n>0 && current%n==0;
    }
}