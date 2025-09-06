public class Solution {

  public String longestCommonPrefix(String[] strs) {
    String first = strs[0];
    int end = first.length();
    for (int i = 1; i < strs.length && end > 0; i++) {
      String s = strs[i];
      int j = 0;
      int limit = Math.min(end, s.length());
      while (j < limit && first.charAt(j) == s.charAt(j)) {
        j++;
      }
      end = j;
    }
    return first.substring(0, end);
  }
}
