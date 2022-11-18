package 数据结构.线性数据结构.队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-17 15:13
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 元素1入队
        queue.offer(1);
        // 元素2入队
        queue.offer(2);

        // 删除第一个
        // 出队 -> 元素1
        queue.poll();
        // 出队 -> 元素2
        queue.poll();
    }


}
