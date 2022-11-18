package 数据结构.非线性数据结构.树;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description:
 * @date 2022-11-17 15:29
 */
public class TreeDemo {

    public static void main(String[] args) {
        // 初始化节点

        // 根节点 root
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(2);

        // 构建引用指向
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
    }

    static class TreeNode {
        // 节点值
        int val;
        // 左子节点
        TreeNode left;
        // 右子节点
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }



}
