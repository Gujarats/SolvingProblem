package Tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gujarat on 09/11/16.
 */
public class BTreePrinterTest {
    private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right))+1;
    }

    @Test
    public void testMaxLevel(){
        Node<Integer> root = new Node<Integer>(2);
        Node<Integer> n11 = new Node<Integer>(7);
        Node<Integer> n12 = new Node<Integer>(5);
        Node<Integer> n21 = new Node<Integer>(5);
        Node<Integer> n22 = new Node<Integer>(5);

        root.left = n11;
        root.right = n12;

        n11.right = n22;

        int expectedLevel = 3;

        assertEquals(expectedLevel,maxLevel(root));
    }
}
