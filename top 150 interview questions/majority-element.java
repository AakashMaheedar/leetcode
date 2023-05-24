class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length ==1){
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

/*
soultion description

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Input: nums = [3,2,3]
Output: 3


When an element appears more than n/2 times in the array, the middle one must be the "majority" number when array is sorted.

Think about this example:

Assume O is the "majority" and X is other numbers. The two extreme cases:

O is at the front.

[O O O O X X X]

O is at the end.

[X X X O O O O]

*/