class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occurance = new HashMap<>();

        for(int element : nums){
            if(occurance.containsKey(element)){
                occurance.put(element, occurance.get(element)+1);
            } else {
                occurance.put(element, 1);
            }
        }

        // System.out.println(occurance);

        List<Integer> uniqueElements = new ArrayList<>(occurance.keySet());

        uniqueElements.sort((a,b) -> 
            occurance.get(b) - occurance.get(a)
        );

        // System.out.println(uniqueElements);
        

        int[] solution = new int[k];

        for(int i = 0; i < k; i++){
            solution[i] = uniqueElements.get(i);
        }

        return solution;
        
    }
}
