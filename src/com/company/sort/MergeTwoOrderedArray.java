package com.company.sort;

import java.util.Arrays;

public class MergeTwoOrderedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int cur = m + n - 1;

        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                nums1[cur--] = nums2[p2--];
            } else if (p2 < 0) {
                nums1[cur--] = nums1[p1--];
            } else if (nums1[p1] < nums2[p2]) {
                nums1[cur--] = nums2[p2--];
            } else {
                nums1[cur--] = nums1[p1--];
            }
        }

        //Arrays.stream(nums1).forEach(a -> System.out.println(a));
    }
}
