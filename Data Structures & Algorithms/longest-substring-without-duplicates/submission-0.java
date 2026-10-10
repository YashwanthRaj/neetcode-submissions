class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int firstIndex = 0;
        int secondIndex = 1;
        int maxLength = 1;

        while (secondIndex < s.length()) {
            String tempString = s.substring(firstIndex, secondIndex);
            char currentElement = s.charAt(secondIndex);

            int duplicateIndex = tempString.indexOf(currentElement);
            
            if (duplicateIndex == -1) {
                secondIndex++;
            } else {
                firstIndex = firstIndex + duplicateIndex + 1;
                secondIndex++; 
            }

            maxLength = Math.max(maxLength, secondIndex - firstIndex);
        }

        return maxLength;
    }
}