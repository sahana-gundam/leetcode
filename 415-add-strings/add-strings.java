class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        String ans = "";
        int carry =0;
        int sum=0;
        while(i>=0 && j>=0){
            sum = (num1.charAt(i)-'0') + (num2.charAt(j)-'0') + carry;
           if(sum>9){
            ans += sum%10;
            carry = sum/10;
           }else{
            ans += sum;
            carry =0;
           }
           i--;j--;
        }
        while(i>=0){
            sum =( num1.charAt(i)-'0' ) + carry;
            ans += sum%10;
            carry=sum/10;
            i--;
        }
        while(j>=0){
            sum =( num2.charAt(j)-'0' ) + carry;
            ans += sum%10;
            carry=sum/10;
            j--;
        }
        if(carry!=0){ 
        ans += carry;
        }
        return new StringBuilder(ans).reverse().toString();
    }
}