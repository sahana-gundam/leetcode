class Solution {
    public int reverseBits(int n) {
        String ans = toBinary(n);
        int bin = toConvertDecimal(ans);    
        return bin;    
    }
    public int toConvertDecimal(String str){
        int ans=0;
        int k=0;
        for(int i=str.length()-1;i>=0;i--){
           ans += Math.pow(2,k)*(str.charAt(i)-'0');
           k++;
        }
        return ans;
    }
    public String toBinary(int n){
        String ans ="";
        for(int i=0;i<32;i++){
            if((n&1)==1){
                ans += 1;
            }else{
                ans += 0;
            }
            n = n >>1;
        }
        return ans;
    }
}