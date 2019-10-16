public class treeNode {
    public Node node;
    public treeNode left = null;
    public treeNode right = null;


    treeNode(String field){

        this.node = createNode(field);
    }

    public void addField(String field){

        this.node = createNode(field);
    }

    public Node createNode(String field){

        return new Node(field);
    }

}
