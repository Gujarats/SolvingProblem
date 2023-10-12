package Tree;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by gujarat on 10/11/16.
 */
public class MirrorBTree {

    private static MirrorBTree singleton = new MirrorBTree();
    private MirrorBTree() { }
    public static MirrorBTree getInstance( ) {
        return singleton;
    }

    public <T extends Comparable<?>>List<Node<T>> mirrorTree(Node<T> node){
        List<Node<T>> nodes = Collections.singletonList(node);
        System.out.println("nodes size "+nodes.size());
        for (int i = 0; i <nodes.size(); i++) {
            System.out.println("swap "+i);
            // swap left and right
            Node temp = nodes.get(i).left;
            nodes.get(i).left = nodes.get(i).right;
            nodes.get(i).right = temp;
        }

        return nodes;
    }


    public <T extends Comparable<?>>Node mirrorTree2(Node<T> node){
       if(node == null) {
          return node;
       }
       //mirror node
        Node temp = node.left;
        node.left=node.right;
        node.right = temp;

        mirrorTree2(node.left);
        mirrorTree2(node.right);

        return node;
    }

}
