class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray(), charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);
        
        return Arrays.equals(charS, charT);
    }
}
