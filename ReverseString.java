class Solution{
  public static String reverse(String str){
    StringBuilder ans = new StringBuilder(str);
    return ans.reverse().toString();
  }
  public static void main(String ...arg){
    String str = "Virender";
    System.out.println(reverse(str));
  }
