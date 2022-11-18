package 数据结构.线性数据结构.链表;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-17 14:50
 */
public class LinkedListDemo {


    public static void main(String[] args) {
        // 实例化节点

        // 节点head
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);

        // 构建引用指向
        n1.next = n2;
        n2.next = n3;
    }


    static class ListNode {
        // 节点值
        int val;
        // 后继节点引用
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }



}
