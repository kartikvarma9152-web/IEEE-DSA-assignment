class Solution {
    public int characterreplacement(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int maxcount = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            counts[s.charAt(right) - 'A']++;
            maxcount = Math.max(maxcount, counts[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
