package 数据结构.线性数据结构.栈;

import java.util.LinkedList;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 栈是一种具有 「先入后出」 特点的抽象数据结构，可使用数组或链表实现。
 * @date 2022-11-17 15:01
 */
public class StackDemo {

    public static void main(String[] args) {
/*        Stack<Integer> stack = new Stack<>();
        // 元素1进栈
        stack.push(1);
        // 元素2进栈
        stack.push(2);

        // 出栈 -> 元素2
        stack.pop();
        // 出栈 -> 元素1
        stack.pop();*/

        LinkedList<Integer> stack = new LinkedList<>();
        // 元素1入栈
        stack.addLast(1);
        // 元素2入栈
        stack.addLast(2);

        // 出栈 -> 元素2
        stack.removeLast();
        // 出栈 -> 元素1
        stack.removeLast();
    }

}
