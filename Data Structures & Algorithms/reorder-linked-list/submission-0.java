/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> ourList = new ArrayList<>();

        ListNode currentPosition = head;

        while(currentPosition.next != null){
            ourList.add(currentPosition.val);
            currentPosition = currentPosition.next;
        }
        ourList.add(currentPosition.val);
        // System.out.println(ourList);

        currentPosition = head;

        ArrayList<Integer> solutionArray = new ArrayList<>();
        int position = 0;
        boolean nFlag = true;
        int length = ourList.size();
        
        for(int i = 0; i < length; i++){
            if(position == 0){
                solutionArray.add(ourList.get(position));
                position++;
            }

            if(nFlag){
                nFlag = false;
                solutionArray.add(ourList.get(length - position));
            } else {
                nFlag = true;
                solutionArray.add(ourList.get(position));
                position++;
            }
        }

        // System.out.println(solutionArray);

        for(int i = 0; i < solutionArray.size(); i++){
            currentPosition.val = solutionArray.get(i);
            currentPosition = currentPosition.next;

            if(currentPosition == null){
                break;
            }
        }
        
    }
}
