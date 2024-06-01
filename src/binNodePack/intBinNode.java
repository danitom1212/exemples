package binNodePack;

public class intBinNode {
    private int data;
    private intBinNode left;
    private intBinNode right;
    public intBinNode(int data) {
        this.data=data;
        left=right=null;
    }
    public  intBinNode(int data,intBinNode left,intBinNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public intBinNode getLeft() {
        return left;
    }

    public intBinNode getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(intBinNode left) {
        this.left = left;
    }

    public void setRight(intBinNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "intBinNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
