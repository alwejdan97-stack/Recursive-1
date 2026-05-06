public class Array11 {
    public int array11(int[] nums, int index){
        //base case
        if(index == nums.length){
            return 0;
        }
        //recursive case
        else if(nums[index] == 11){
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }
}
