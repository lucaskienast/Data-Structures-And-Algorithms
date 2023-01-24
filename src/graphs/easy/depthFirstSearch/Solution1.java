package graphs.easy.depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // O(v+e) T
    // O(v) S

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(name);
            for (Node childNode : children)
                childNode.depthFirstSearch(array);
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
