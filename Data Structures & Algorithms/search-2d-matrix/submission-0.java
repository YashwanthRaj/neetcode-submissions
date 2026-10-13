class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int halfWay = (start + end)/2;

        int[] currentArray = matrix[halfWay];
        int s = 0;
        int e = currentArray.length - 1;
        int midElement = (s+e)/2;

        while(true){
            if(currentArray[0] <= target && currentArray[currentArray.length-1] >= target){
                if(currentArray[midElement] == target){
                    return true;
                } else if (currentArray[midElement] > target){
                    e = midElement-1;
                } else {
                    s = midElement+1;
                }
                midElement = (s+e)/2;

                if(s > e){
                    break;
                }

                
                
            } else {
                if(currentArray[0] > target){
                    end = halfWay - 1;
                } else {
                    start = halfWay + 1;
                }

                if(start > end){
                    break;
                }
                halfWay = (start + end)/2;
                currentArray = matrix[halfWay];
                s = 0;
                e = currentArray.length-1;
                midElement = (s+e)/2;

            }
        }

        return false;
        
    }
}
