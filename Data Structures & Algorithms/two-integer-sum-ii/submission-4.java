class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // TRY 1
        // int[] solution = {0,0};

        // while(true){
        //     if(numbers[solution[0]] + numbers[solution[1]] != target){
        //         if(solution[1] == numbers.length-1){
        //             solution[0]+=1;
        //             solution[1] = solution[0]+1;
        //         } else {
        //             solution[1] += 1;
        //         }
        //     } else {
        //         solution[0]+=1;
        //         solution[1]+=1;
        //         break;
        //     }
        // }
        // return solution;

        // TRY 2
        // int pointer_1 = 0;
        // int pointer_2 = pointer_1+1;
        // int[] solution = new int[2];

        // while(pointer_1 < numbers.length - 1){
        //     if(numbers[pointer_1]+numbers[pointer_2] == target){
        //         solution[0] = pointer_1+1;
        //         solution[1] = pointer_2+1;
        //         break;
        //     } else {
        //         if(pointer_2 == numbers.length-1){
        //             pointer_1++;
        //             pointer_2 = pointer_1+1;
        //         } else {
        //             pointer_2++;
        //         }
        //     }
        // }
        // return solution;

        int p1 = 0;
        int p2 = numbers.length-1;
        int[] indices = new int[2];
        while(true){
            int currentSum = numbers[p1] + numbers[p2];
            if(currentSum > target){
                p2--;
            } else if (currentSum < target) {
                p1++;
            } else {
                indices[0]=p1+1;
                indices[1]=p2+1;
                break;
            }
        }

        return indices;
    }
}
