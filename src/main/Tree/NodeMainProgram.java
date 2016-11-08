package Tree;

/**
 * Created by gujarat on 28/10/16.
 */
public class NodeMainProgram {
    public static void main(String [] args){
        Node [] nodes = new Node[2];
        // create object node 1
        Node node1 = new Node(5,3,12);
        Node node2 = new Node(12,10,15);
        // assign to node list
        nodes[0] = node1;
        nodes[1] = node2;

        Nodes nodeList = new Nodes();
        nodeList.setNodes(nodes);

        nodeList.printNode(node1);
        //nodeList.print();
        //System.out.println("========");
        //Node [] nodesReflected = nodeList.getReflection();
        //nodeList.print(nodesReflected);
    }
}
