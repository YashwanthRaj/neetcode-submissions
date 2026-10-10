class Solution {
    public boolean isValid(String s) {
        if(s.length() <2){
            return false; 
        }

        Deque<Character> ourQueue = new ArrayDeque<>();
        
        for(int i = s.length()-1; i >= 0; i--) {
            if(ourQueue.peek() == null){
                ourQueue.push(s.charAt(i));
                continue;
            }
            
            if(s.charAt(i) == '{'){
                if(ourQueue.peek() == '}'){
                    ourQueue.pop();
                    continue;
                }
            } else if(s.charAt(i) == '('){
                if(ourQueue.peek() == ')'){
                    ourQueue.pop();
                    continue;
                }
            } else if(s.charAt(i) == '['){
                if(ourQueue.peek() == ']'){
                    ourQueue.pop();
                    continue;
                }
            } 
            
            ourQueue.push(s.charAt(i));

        }

        return ourQueue.isEmpty();
    }
}
