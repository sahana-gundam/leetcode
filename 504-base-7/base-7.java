class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isnegative = num<0;
         int n = Math.abs(num);
         while(n>0){
            sb.append(n%7);
            n = n/7;
         }
         if(isnegative){
            sb.append("-");
         }
         return sb.reverse().toString();
    }
}