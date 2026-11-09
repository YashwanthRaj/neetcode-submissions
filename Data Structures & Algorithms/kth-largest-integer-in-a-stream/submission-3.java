class KthLargest {
    int[] nums;
    int k;
    List<Integer> stack = new ArrayList<>();


    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

        for(int num : this.nums){
            stack.add(num);
        }
    }

    
    public int add(int val) {
        stack.add(val);
        stack.sort((a,b) -> (b-a));
        return stack.get(k-1);
        
    }
}
