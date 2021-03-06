package Trees;

import java.util.LinkedList;
import java.util.List;

public class postorderTreeTraversal {


    // Definition for a Node.
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

        public List<Integer> postorder(Node root) {
            if (root == null) return list;
            for (Node n : root.children){
                if (n!=null)
                    postorder(n);
            }
            list.add(root.val);

            return list;
        }
}
