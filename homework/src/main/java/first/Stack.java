package first;

/**
 * 栈 先进后出
 * push （Object 0)
 * pop 返回栈顶 Object，并删除该Object
 * peek 只返回Object，没有删除操作
 */
public class Stack {
    private int mCount;
    private LinkedList mLinkedData = new LinkedList();
    private ArrayList mArrayData = new ArrayList();

    /**
     * 项栈顶插入元素
     *
     * @param o
     */
    public void push(Object o) {
        mLinkedData.addFirst(o);
    }

    /**
     * 获取并删除栈顶元素
     *
     * @return
     */
    public Object pop() {
        return mLinkedData.removeFirst();
    }

    /**
     * 获取但不删除栈顶元素
     *
     * @return
     */
    public Object peek() {
        return mLinkedData;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -1;
    }
}
