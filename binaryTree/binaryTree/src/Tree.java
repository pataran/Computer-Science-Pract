public class Tree {
    treeNode root = null;


    public Tree(){
        this.root = null;
    }


    public void createTree(String[] fields){

        //while we have data in a list
        for(int i = 0; i < fields.length; i++) {

            treeNode newNode = new treeNode(fields[i]);
            System.out.println(newNode.node.field);
            //System.out.println(newNode.node.hash);
            //If root not created...
            if (this.root == null) {

                this.root = newNode;

            } else {

                treeNode current = this.root;
                boolean search = true;

                while (search) {

                        if(current.node.hash > newNode.node.hash) {
                            if (current.left != null) {

                                current = current.left;

                            } else {

                                search = false;
                            }
                        }else {

                            if (current.right != null) {

                                current = current.right;

                            } else {

                                search = false;
                            }

                        }

                }

                if (newNode.node.hash < current.node.hash) {

                    System.out.println("left being assigned " + newNode.node.hash );
                    current.left = newNode;

                } else {

                    System.out.println("right being assigned " + newNode.node.hash );
                    current.right = newNode;

                }


            }

        }

    }


    public void printTree(){
        treeNode current = this.root;
        
        while(current != null){
            System.out.println(current.node.field);

            //traverse and print left nodes
            while(current.left != null){
                System.out.println(current.node.field);
                current = current.left;
            }



        }


    }
}

