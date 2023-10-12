package Tree;


/**
 * Created by gujarat on 28/10/16.
 */
public class Node<T extends Comparable<?>> {
    Node left;
    Node right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}

