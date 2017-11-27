package com.jason.exercise;

import com.jason.common.TreeNode;
import org.junit.Test;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo8 {

    /**
     * 二叉树-按层遍历
     * 利用宽度优先队列，用两个变量last,nlast来记录，nlast是下一个行的最右节点，last是当前的一个节点
     * last指向队列中最新的一个节点，当last和当前要打印的节点相同时，换行
     * @param node
     */
    public void foreach(TreeNode node){
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        TreeNode last=node ,nlast = null;
        queue.offer(node);
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            if (t!=null){
                System.out.print(t.name+"   ");
                if (t.left != null){
                    TreeNode left = t.left;
                    nlast=left;
                    queue.offer(left);
                }
                if (t.right!=null){
                    TreeNode right = t.right;
                    nlast = right;
                    queue.offer(right);
                }
            }
            if (last == t){
                System.out.println();
                last = nlast;
            }

        }
    }

    /**
     * 非递归遍历-先序遍历
     * 思路：利用栈来实现
     * @param node
     */
    public void foreach1(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = node;
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                System.out.println(root.name);
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                root = root.right;
            }
        }
    }

    /**
     * 非递归-中序遍历
     * @param node
     */
    public void foreach2(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = node;
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                System.out.println(root.name);
                root = root.right;

            }
        }
    }

    /**
     * 非递归-后序遍历
     * @param node
     */
    public void foreach6(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> out = new Stack<>();
        TreeNode root = node;
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                out.push(root);
                stack.push(root);
                root = root.right;
            }else {
                root = stack.pop();
                root = root.left;
            }
        }
        while (!out.isEmpty()){
            System.out.println(out.pop().name);
        }
    }

    /**
     * 先序-递归遍历
     * @param node
     */
    public void foreach3(TreeNode node){
        if(node!=null){
            System.out.println(node.name);
            TreeNode left = node.left;
            foreach3(left);
            TreeNode right = node.right;
            foreach3(right);
        }
    }

    /**
     * 中序-递归遍历
     * @param node
     */
    public void foreach4(TreeNode node){
        if (node!=null){
            TreeNode left = node.left;
            foreach4(left);
            System.out.println(node.name);
            TreeNode right = node.right;
            foreach4(right);
        }
    }

    /**
     * 递归后序遍历
     * @param node
     */
    public void foreach5(TreeNode node){
        if (node!=null){
            TreeNode left = node.left;
            foreach5(left);
            TreeNode right = node.right;
            foreach5(right);
            System.out.println(node.name);
        }
    }



    @Test
    public void test(){
        TreeNode root = new TreeNode("root");
        TreeNode root1 = new TreeNode("1");
        TreeNode root2 = new TreeNode("2");
        TreeNode root3 = new TreeNode("3");
        TreeNode root4 = new TreeNode("4");
        TreeNode root5 = new TreeNode("5");
        TreeNode root6 = new TreeNode("6");
        root.left = root1;
        root.right = root2;
        root1.left  = root4;
        root2.left = root3;
        root2.right = root5;
        root3.right = root6;
//        foreach(root);
//        foreach3(root);
//        foreach4(root);
//        foreach5(root);
//        foreach2(root);
//        foreach1(root);
//        foreach2(root);
        foreach6(root);
    }
}
