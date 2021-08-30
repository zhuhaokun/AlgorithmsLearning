package com.company.dynamicProgramming;

public class GetWater2 {
    public int trap(int[] height) {
        int ans = 0;
        int leftPointer = 0, rightPointer = height.length - 1, leftMax = 0, rightMax = 0;
        while (leftPointer != rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                leftMax = Math.max(leftMax, height[leftPointer]);
                ans += leftMax - height[leftPointer];
                leftPointer++;
            } else {
                rightMax = Math.max(rightMax, height[rightPointer]);
                ans += rightMax - height[rightPointer];
                rightPointer--;
            }
        }
        return ans;
    }
}
