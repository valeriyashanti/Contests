package DataStructs;

public class BinaryTree {

    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if (root == null)
            root = newNode;
        else {
            Node focusNode = root;
            Node parent;
            while (true){
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void inOrdertraverseNode(Node focusNode) {
        if (focusNode!= null){
            inOrdertraverseNode(focusNode.leftChild);
            System.out.println(focusNode);
            inOrdertraverseNode(focusNode.rightChild);
        }
    }

    public void preOrderTraverseNode(Node focusNode){
        if (focusNode != null){
            System.out.println(focusNode);
            preOrderTraverseNode(focusNode.leftChild);
            preOrderTraverseNode(focusNode.rightChild);
        }
    }

    public void postOrderTraverseNode(Node focusNode){
        if (focusNode != null){
            postOrderTraverseNode(focusNode.leftChild);
            postOrderTraverseNode(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key){
        Node focusNode = root;
        while (focusNode.key != key){
            if (key < focusNode.key)
                focusNode = focusNode.leftChild;
            else
                focusNode = focusNode.rightChild;
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

    public boolean removeNode(int key){
        Node focusNode = root;
        Node parent = root;

        boolean isItALeftChild = true;
        while (focusNode.key != key){
            parent = focusNode;
            if (key < focusNode.key) {
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            } else {
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)
                return false;
        }
        if (focusNode.leftChild == null && focusNode.rightChild == null){
            if (focusNode == root)
                root = null;
            else if (isItALeftChild){
                parent.leftChild = null;
            } else
                parent.rightChild = null;
        } else if (focusNode.rightChild == null){
            if (focusNode == root)
                root = focusNode.leftChild;
            else if (isItALeftChild)
                parent.leftChild = focusNode.leftChild;
            else
                parent.rightChild = focusNode.leftChild;
        } else if (focusNode.leftChild == null){
            if (focusNode == root)
                root = focusNode.rightChild;
            else if (!isItALeftChild)
                parent.leftChild = focusNode.rightChild;
            else
                parent.rightChild = focusNode.rightChild;
        } else {
            Node replacment =  getReplacmentNode(focusNode);

            if (focusNode == root)
                root = replacment;
            else if (isItALeftChild)
                parent.leftChild = replacment;
            else
                parent.rightChild = replacment;
            replacment.leftChild = focusNode.leftChild;
        }
        return true;
    }

    public Node getReplacmentNode(Node replaceNode){
        Node replacementParent = replaceNode;
        Node replacement = replaceNode;

        Node focusNode = replaceNode.rightChild;
        while (focusNode != null){
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = replacementParent;
        }
        if (replacement != replaceNode.rightChild){
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replaceNode.rightChild;
        }
        return replacement;
    }

    public static void main(String[] args) {
        BinaryTree newTree = new BinaryTree();
        newTree.addNode(3, "Three");

        newTree.addNode(6, "And");
        newTree.addNode(7, "Marry");
        newTree.addNode(1, "One");
        newTree.addNode(2, "Two");

        newTree.addNode(8, "Nodes");
        newTree.addNode(4, "Peter");
        newTree.addNode(5, "Paul");

//        newTree.inOrdertraverseNode(newTree.root);
//        System.out.println("\n\n\n");
//        newTree.preOrderTraverseNode(newTree.root);
//        System.out.println("\n\n\n");
//        newTree.postOrderTraverseNode(newTree.root);

//        System.out.println("Search 30" );
//        System.out.println(newTree.findNode(30));
//        System.out.println("Search 67" );
//        System.out.println(newTree.findNode(8));


        System.out.println("REMOVE 5");
        newTree.removeNode(5);
        newTree.inOrdertraverseNode(newTree.root);
    }
}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "key=" + key +
                ", name='" + name;
    }
}
