//LC - 26. Remove Duplicates from Sorted Array

//in case of sorted array
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
             if(nums[i] == nums[j]){
                continue;
            }
            j++;
            nums[j] = nums[i]; 
        }
        return j+1;
    }
}

//in case of non-sorted array
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet returnSet = new HashSet<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
             if(returnSet.add(nums[i])){
                nums[j++] = nums[i]; 
            }
        }
        return returnSet.size();
    }
}
