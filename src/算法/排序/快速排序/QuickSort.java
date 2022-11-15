package 算法.排序.快速排序;

import java.util.Arrays;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-15 14:50
 */
public class QuickSort {

    public static void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        // 找到哨兵
        int i = partition(nums, l, r);
        // 递归左数组
        quickSort(nums, l, i - 1);
        // 递归右数组
        quickSort(nums, i + 1, r);
    }

    /**
     * 找哨兵
     *
     * @param nums
     * @param l
     * @param r
     * @return
     */
    public static int partition(int[] nums, int l, int r) {
        // 以nums[l]作为基准数
        int i = l, j = r;
        while (i < j) {
            // i为左，j为右
            // 从右向左找首个小于基准数l（i）的元素
            while (i < j && nums[j] >= nums[i]) {
                j--;
            }
            // 从左向右找首个大于基准数l（i）的元素
            while (i < j && nums[i] <= nums[j]) {
                i++;
            }
            // 开始交换
            swap(nums, i, j);
        }
        // 相等时，交换基准数与当前位置
        swap(nums, i, l);
        return i;
    }


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 2, 5};
        System.out.println("排序前：" + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序后：" + Arrays.toString(nums));
    }

}
