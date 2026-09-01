
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newReturn = new int[2*nums.length];
        for(int i=0; i < nums.length; i++){
            newReturn[i] = nums[i];
        }
        int newIndex = nums.length;
        for(int i=0; i < nums.length; i++){
            newReturn[newIndex++] = nums[i];
        }
        return newReturn;
    }
}
