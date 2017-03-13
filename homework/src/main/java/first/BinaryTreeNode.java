package first;

/**
 * 二叉树
 * 作业：形成以下要求
 * 1.左节点的值总是比父节点值小
 * 2.右节点的值总是比父节点值大
 * 3.向二叉树中插入值4&8
 */
public class BinaryTreeNode {

    private Object data;//数据，每个节点保存的数据
    private BinaryTreeNode left;//左节点
    private BinaryTreeNode right;//右节点

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode insert(Object o) {
        return null;
    }

}
