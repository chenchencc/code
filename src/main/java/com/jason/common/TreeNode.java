package com.jason.common;

public class TreeNode {

    public TreeNode left;

    public String name;

    public TreeNode() {
    }

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode right;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeNode treeNode = (TreeNode) o;

        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) return false;
        if (name != null ? !name.equals(treeNode.name) : treeNode.name != null) return false;
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
