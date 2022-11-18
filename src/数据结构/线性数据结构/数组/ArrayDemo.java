package 数据结构.线性数据结构.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-17 14:36
 */
public class ArrayDemo {

    public static void main(String[] args) {

        /**
         * 初始化
         */
//        // 初始化数组方式一：
//        // 初始化一个长度为5的数组array
//        int[] array = new int[5];
//        // 元素赋值
//        array[0] = 2;
//        array[1] = 0;
//        array[2] = 6;
//        array[3] = 4;
//        array[4] = 1;
//        System.out.println(Arrays.toString(array));

//        // 初始化方式二：
//        int[] array = {2, 0, 6, 4, 1};

        // 初始化可变数组
        List<Integer> array = new ArrayList<>();

        // 向尾部添加元素
        array.add(2);
        array.add(0);
        array.add(6);
        array.add(4);
        array.add(1);
        System.out.println(Arrays.toString(array.toArray()));

    }


}
