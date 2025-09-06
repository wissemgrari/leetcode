public class Solution {

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    System.out.println(s.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    System.out.println(s.longestCommonPrefix(new String[]{"dog", "racecar"}));
  }

  public String longestCommonPrefix(String[] strs) {
    String first = strs[0];
    int substring = first.length();

    for (int i = 1; i < strs.length; i++) {
      int max_iteration = Math.min(substring, strs[i].length());
      int j = 0;
      while (j < max_iteration && first.charAt(j) == strs[i].charAt(j)) {
        j++;
      }
      substring = j;
      // the loop should terminate early if no common prefix exists
      if (substring == 0) {
        break;
      }
    }
    return first.substring(0, substring);
  }
}
