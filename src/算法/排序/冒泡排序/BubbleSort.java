package 算法.排序.冒泡排序;

import java.util.Arrays;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-15 16:19
 */
public class BubbleSort {

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 4, 1, 6};
        System.out.println("排序前：" + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
