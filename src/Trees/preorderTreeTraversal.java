package Trees;

import java.util.LinkedList;
import java.util.List;

public class preorderTreeTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

        List<Integer> list = new LinkedList<>();

        public List<Integer> preorder(Node root) {
            if (root == null) return list;
            list.add(root.val);
            for (Node n : root.children){
                if (n!=null)
                    preorder(n);
            }
            return list;
        }
}
