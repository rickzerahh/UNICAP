package ed1.BinaryTree.atividade14;

class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    public BinaryTree(){
        this.raiz = null;
    }

    public boolean isEmpty(){
        if(this.raiz == null){
            return true;
        }else{
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            this.raiz = new TreeNode<T>(value);
        } else {
            this.raiz.insertNode(value);
        }
    }

    public void inserir(T value) {
        TreeNode<T> aux, novo;
        if (this.isEmpty() == true) {
            this.raiz = new TreeNode<T>(value);
            System.out.println("Inserção efetuada");
        } else {
            aux = this.raiz;
            while (true) {
                if (value.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor reptido. Inserção não efetuada.");
                    return;
                } else if (value.compareTo(aux.getInfo()) < 0) {
                    if (aux.getLeft() == null) {
                        novo = new TreeNode<T>(value);
                        aux.setLeft(novo);
                        System.out.println("Inserção efetuada");
                        return;
                    } else {
                        aux = aux.getLeft();
                    }
                } else {
                    if (aux.getRight() == null) {
                        novo = new TreeNode<T>(value);
                        aux.setRight(novo);
                        System.out.println("Inserção efetuada");
                        return;
                    } else {
                        aux = aux.getRight();
                    }
                }
            }
        }
    }

    public void remove (T valor) {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.raiz = this.removeNode(this.raiz, valor);
        }
    }

    private TreeNode<T> removeNode (TreeNode<T> r, T valor) {
        if (r != null) {
            if (valor.compareTo(r.getInfo()) == 0) {
                TreeNode<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) {
                    r = null;
                } else if (r.getLeft() == null) { 
                    r = r.getRight();
                } else if (r.getRight() == null) { 
                     r = r.getLeft();
                } else { 
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null) {
                        pai = filho;
                        filho = filho.getRight();
                    }
                    pai.setRight(filho.getLeft());
                    r.setInfo(filho.getInfo());
                }
            } else if (valor.compareTo(r.getInfo()) < 0) {
                r.setLeft(removeNode(r.getLeft(), valor));
            } else {
                r.setRight(removeNode(r.getRight(), valor));
            }
        }
        return r;
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            percorrerEmOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(TreeNode<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }

    public T find(T value) {
        if (this.isEmpty() == true) {
            return null;
        } else {
            return this.raiz.findNode(value);
        }
    }
}