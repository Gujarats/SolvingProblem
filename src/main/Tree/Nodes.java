package Tree;

/**
 * Created by gujarat on 28/10/16.
 */
public class Nodes {
    private int index;
    private Node[] nodes;
    int row = 0;
    int space = 0;
    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }

    public Node[] getReflection(){
        Node[] result = new Node[this.getNodes().length];
        for (int i = 0; i <this.getNodes().length; i++) {
            Node node = this.getNodes()[i];
            int lefValue = node.getLeft();
            node.setLeft(node.getRight());
            node.setRight(lefValue);
            result[i] = node;
        }

        return result;
    }

    public void print(){
        Node node = this.getNodes()[index];
        //print first parent
        System.out.println(node.getValue());
        //print child
        printChild(node);
        //checking left value from next node
        Node nextNode = this.getNodes()[index];
        if(isValueExist(node.getLeft(),nextNode)){
            //print child here
            printChild(nextNode);
        }

        if(isValueExist(node.getRight(),nextNode)){
            printChild(nextNode);
        }
        // got to the next node
        if(index < this.getNodes().length){
            index++;
            printChild(this.getNodes()[index]);
        }
    }

    public void print(Node[] inputNode){
        System.out.println("     "+inputNode[0].getValue());
        for (int i = 0; i < inputNode.length; i++) {
            //printValue
            printChild(inputNode[i]);

        }
    }

    public void printNode(Node node){
        System.out.println(" "+node.getValue()+" ");
        System.out.println("/ \\");
        System.out.println(node.getLeft()+" "+node.getRight());
    }


    public void printNode(Node[] nodes){

        int childChar = getChildCharacter(nodes);
        // print the parent using the char
        for (int i = 0; i <childChar/2 ; i++) {
            System.out.print(" ");
            space++;
        }

        System.out.println(nodes[0].getValue());
        row++;
        printTree();

    }

    private void printChild(Nodes[] node, int row, int childChar){
        printSpace();

    }

    private int getMaxRow(Nodes []nodes){
        return (nodes.length*2)+1;
    }

    private void printTree(){
       //getting the first space
        printSpace();
        System.out.print("/ \\");
    }

    private void printSpace(){
        space--;
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
    }

    private int getChildCharacter(Node[] nodes){
        return (3*nodes.length)+1;
    }

    private boolean isValueExist(int value, Node inputNode){
        if(value == inputNode.getValue())
            return true;
        return false;
    }

    private void printChild(Node node){
        System.out.println("/    \\");
        System.out.println(node.getLeft() + "    "+ node.getRight());
    }
}
