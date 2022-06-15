package Leet_Code

/*
217. Contains Duplicate 1
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsArray = nums.size
        val arrayToSet = nums.toSet()
        return numsArray != arrayToSet.size
    }
}


// Runtime: 882 ms, faster than 16.54% of Kotlin online submissions for Contains Duplicate.
// Memory Usage: 78.2 MB, less than 5.74% of Kotlin online submissions for Contains Duplicate.

/*
Other contributions

Hash Map - beets 99%
luusanity
13
August 19, 2020 12:06 PM

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val uniqueMap = mutableMapOf<Int, Boolean>()
        nums.forEach {
            uniqueMap[it]?.let { return true }
            uniqueMap[it] = true
        }
        return false
    }
}


One Liner
GeorgCantor
140
January 20, 2021 12:49 AM

235 VIEWS

fun containsDuplicate(nums: IntArray) = nums.size > nums.toSet().size

 */