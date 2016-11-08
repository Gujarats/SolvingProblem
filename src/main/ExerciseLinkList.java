import Tree.Node;

import java.util.LinkedList;

/**
 * Created by gujarat on 28/10/16.
 */
public class ExerciseLinkList {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        Node node = new Node(5,21,31);
        linkedList.add(node);
        linkedList.add(node);
        linkedList.add(node);
        System.out.println(linkedList.size());
        System.out.println(((Node)linkedList.get(2)).getLeft());
    }
}
