class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index = 0;
        addSubsets(nums, index, subset, solution);
        return solution;
    }

    public void addSubsets(int[] nums, int i, List<Integer> subset, List<List<Integer>> solution) {
        if(i >= nums.length){
            solution.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        addSubsets(nums, i+1, subset, solution);
        subset.remove(subset.size() - 1);
        addSubsets(nums, i+1, subset, solution);
    }
}
