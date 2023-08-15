package ed1.BinaryTree.atividade14;

public class TreeNode<T extends Comparable<T>> {
    private T info;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value){
        this.info = value;
    }

    public T getInfo(){
        return this.info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public TreeNode<T> getLeft(){
        return this.left;
    }

    public void setLeft(TreeNode<T> left){
        this.left = left;
    }

    public TreeNode<T> getRight(){
        return right;
    }

    public void setRight(TreeNode<T> right){
        this.right = right;
    }

    void insertNode(T value) {
        if (value.compareTo(this.getInfo()) == 0) {
            System.out.println("Valor repetido.");
        } else if (value.compareTo(this.getInfo()) < 0) {
            if (this.left == null) {
                this.left = new TreeNode<T>(value);
            } else {
                this.left.insertNode(value);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode<T>(value);
            } else {
                this.right.insertNode(value);
            }
        }
    }

    T findNode(T value) {
        if (value.compareTo(this.getInfo()) == 0) {
            return this.getInfo();
        } else if (value.compareTo(this.getInfo()) < 0) {
            if (this.getLeft() == null) {
                return null;
            } else {
                return this.getLeft().findNode(value);
            }
        } else {
            if (this.getRight() == null) {
                return null;
            } else {
                return this.getRight().findNode(value);
            }
        }
    }
}