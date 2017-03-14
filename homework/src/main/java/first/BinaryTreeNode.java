package first;

/**
 * 二叉树
 * 作业：形成以下要求
 * 1.左节点的值总是比父节点值小
 * 2.右节点的值总是比父节点值大
 * 3.向二叉树中插入值4&8
 */
public class BinaryTreeNode {

    private Comparable data;//数据，每个节点保存的数据   改为Comparable用以比较大小
    private BinaryTreeNode left;//左节点
    private BinaryTreeNode right;//右节点

    public BinaryTreeNode(Comparable o, BinaryTreeNode o1, BinaryTreeNode o2) {

    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
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

    public BinaryTreeNode insert(Comparable o) {
        BinaryTreeNode insertNode=new BinaryTreeNode(o,null,null);
        BinaryTreeNode currentNode=this;
        while ((null!=currentNode)){
            Comparable data=currentNode.getData();
            int result=data.compareTo(o);
            if (result==0){
                return currentNode;
            }
            if (result>0){
                if (null==currentNode.getLeft()){
//                    BinaryTreeNode insertNode=new BinaryTreeNode(o,null,null);
                }
            }
            if (result<0){
                if (null==currentNode.getRight()){
                    
                }
            }
        }
        return null;
    }

}
