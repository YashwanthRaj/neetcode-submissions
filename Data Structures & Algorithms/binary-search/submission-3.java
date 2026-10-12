class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int currentIndex = (startIndex + endIndex)/2;

        while(true){
            if(startIndex == endIndex){
                if(nums[startIndex] == target){
                    return startIndex;
                } else {
                    break;
                }
            }

            if(nums[currentIndex] == target){
                return currentIndex;
            } else if (nums[currentIndex] < target){
                startIndex = currentIndex + 1;
                if(startIndex >= nums.length) {
                    break;
                }
                currentIndex = (startIndex + endIndex)/2;
            } else {
                endIndex = currentIndex - 1;
                if(endIndex < 0){
                    break;
                }
                currentIndex = (startIndex + endIndex)/2;
            }
        }

        return -1;
    }
}
