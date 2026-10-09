class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> listWithoutSpecialChar = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                listWithoutSpecialChar.add(Character.toLowerCase(s.charAt(i)));
            }
        }

        System.out.println(listWithoutSpecialChar);

        int pointer_1 = 0;
        int pointer_2 = listWithoutSpecialChar.size() - 1;

        for(int i = 0; pointer_1 < pointer_2; i++ ){
            if(listWithoutSpecialChar.get(pointer_1) == listWithoutSpecialChar.get(pointer_2)){
                pointer_1++;
                pointer_2--;
            } else {
                return false;
            }
        }
        return true;
    }
}
