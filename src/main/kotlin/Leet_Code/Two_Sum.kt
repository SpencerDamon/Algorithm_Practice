package Leet_Code


/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

/*
Runtime: 280 ms
Memory Usage: 38.7 MB
 */

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val startIndex = i + 1
            for (j in startIndex..nums.lastIndex) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        //println("Index $i equals ${nums[i]}")

        return intArrayOf(0, -1)
    }
}