class Solution {

    public String reOrderString(String temp) {
        char[] tempArray = temp.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solutionArray = new ArrayList<>();

        HashMap<String, List<String>> solutionHashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String currentKey = reOrderString(strs[i]);

            if (solutionHashMap.containsKey(currentKey)) {
                solutionHashMap.get(currentKey).add(strs[i]);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                solutionHashMap.put(currentKey, newGroup);
            }
        }

        for (List<String> group : solutionHashMap.values()) {
            solutionArray.add(group);
        }

        return solutionArray;
    }
}