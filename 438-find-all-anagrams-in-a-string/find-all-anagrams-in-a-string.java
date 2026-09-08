class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // Frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);

            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            char ch = s.charAt(right);

            windowMap.put(
                ch,
                windowMap.getOrDefault(ch, 0) + 1
            );

            // Keep window size equal to p.length()
            if (right - left + 1 > p.length()) {

                char remove = s.charAt(left);

                windowMap.put(
                    remove,
                    windowMap.get(remove) - 1
                );

                if (windowMap.get(remove) == 0) {
                    windowMap.remove(remove);
                }

                left++;
            }

            // If frequencies match, anagram found
            if (windowMap.equals(pMap)) {
                ans.add(left);
            }
        }

        return ans;
    }
}