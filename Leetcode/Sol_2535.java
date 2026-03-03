// You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.

package Leetcode;
public class Sol_2535{

    public static int differenceOfSum(int[] nums) {
        int eltSum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            eltSum = eltSum + nums[i];
            while(nums[i]>0){
                int lastDigit = nums[i]%10;
                digitSum += lastDigit;
                nums[i] = nums[i]/10;
            }
        }

        return Math.abs(eltSum-digitSum);
        
    }

    public static void main(String[] args){

        int nums[] = {1,15,6,3};
        int result = differenceOfSum(nums);
        System.out.println("Result = "+ result);

    }

}

//TC = O(n*k) where n is the length of array and k is number digits in each number.