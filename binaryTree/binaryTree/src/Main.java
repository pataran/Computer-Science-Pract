public class Main {

    public static void main(String[] args) {

      String[] names = {"apple","jacob", "bianca", "bram","john","pawpaw", "robin","able"};


//        Node node1 = new Node("apple");
//        Node node2 = new Node("bianca");
//
//        System.out.println(node1.hash);
//        System.out.println(node2.hash);

      Tree Tree = new Tree();

      Tree.createTree(names);



      System.out.println("//////////////////////////////");
        System.out.println(Tree.root.node.field);
        System.out.println(Tree.root.left.node.field);
            System.out.println(Tree.root.right.node.field);
            System.out.println(Tree.root.right.left.node.field);
        System.out.println(Tree.root.right.left.right.node.field);
        System.out.println(Tree.root.right.right.node.field);
        System.out.println(Tree.root.right.right.right.node.field);
        System.out.println(Tree.root.right.right.right.right.node.field);


    System.out.println("//////////////////////////////");

        fibonacci test = new fibonacci();
    // System.out.println(test.easyfactorial(5));
        System.out.println(test.recursiveFactorial(5));
  }
}