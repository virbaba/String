public class Solution {
    public static Boolean isPalindrome(String s) {
        // Write your code here..
        return (new StringBuffer(s).reverse().toString().equals(s))? true: false;
    }

}
