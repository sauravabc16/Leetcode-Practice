class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        String last = arrOfStr[arrOfStr.length-1];
        int size = last.length();
        return size;
    }
}