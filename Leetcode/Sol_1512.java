// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

package Leetcode;
public class Sol_1512 {

    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    pairs++;
                }
            }

        }
        return pairs;
        
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
    
}

//Time Complexity = O(N^2)
// It can be optimized using Hashmap - O(N)