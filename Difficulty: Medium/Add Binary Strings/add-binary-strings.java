// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
       int i = s1.length() - 1;
       int j = s2.length() - 1;
       int carry = 0;
       
       StringBuilder result = new StringBuilder();
       
       while(i >= 0 || j >= 0 || carry != 0) {
           int sum = carry;
           
           if(i >=0) {
               sum += s1.charAt(i) - '0';
               i--;
           }
           if(j >=0) {
               sum += s2.charAt(j) - '0';
               j--;
           }
           
           result.append(sum % 2);
           carry = sum / 2;
       }
       result.reverse();
       
       int index = 0;
       while(index < result.length() - 1 && result.charAt(index) == '0') {
           index++;
       }
       return result.substring(index);
    }
}