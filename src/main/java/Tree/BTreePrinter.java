package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gujarat on 09/11/16.
 */
public class BTreePrinter {

    private static BTreePrinter singleton = new BTreePrinter();
    private BTreePrinter() { }
    public static BTreePrinter getInstance( ) {
        return singleton;
    }

    /**
     * public method for print the binary tree
     * @param root
     * @param <T>
     */
    public <T extends Comparable<?>> void printNode(Node<T> root) {
        int maxLevel = maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    /**
     * public method for print the binary tree
     * @param nodes
     * @param <T>
     */
    public <T extends Comparable<?>> void printNode(List<Node<T>> nodes) {
        int maxLevel = maxLevel(nodes.get(0));

        printNodeInternal(nodes, 1, maxLevel);
    }



    /**
     * main algorithm to print binary Tree
     * @param nodes
     * @param level determine current level
     * @param maxLevel deep tree/ max deep tree level
     * @param <T>
     */
    private <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        // checking null nodes and elements
        if (nodes.isEmpty() || isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endLines = (int) Math.pow(2, (floor-1));
        int firstSpaces = (int) Math.pow(2, floor) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        //create newNodes for recursive
        List<Node<T>> newNodes = new ArrayList<Node<T>>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            printWhitespaces(betweenSpaces);
        }
        System.out.println();

        //print strip
        for (int i = 1; i <= endLines; i++) {
            for (Node<T> node : nodes) {
                printWhitespaces(firstSpaces - i);
                if (node == null) {
                    printWhitespaces(endLines + endLines + i + 1);
                    continue;
                }

                if (node.left != null)
                    System.out.print("/");
                else
                    printWhitespaces(1);

                printWhitespaces(i + i - 1);

                if (node.right != null)
                    System.out.print("\\");
                else
                    printWhitespaces(1);

                printWhitespaces(endLines + endLines - i);
            }

            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    /**
     * print white space long depend on count
     * @param count
     */
    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    /**
     * @param node
     * @return maximal level/deep tree
     */
    private int maxLevel(Node node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }

    /**
     * @param list
     * @param <T>
     * @return true/false for checking all element
     */
    private <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

