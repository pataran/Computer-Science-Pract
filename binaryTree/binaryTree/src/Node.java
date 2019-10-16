public class Node {
    public String field;
    public int hash;

    public Node(String field){
        this.field = field;
        this.hash = hashVal();
    }


    public int hashVal(){

        String field = this.field;
        char[] charArray = field.toCharArray();

        int hashVal = (charArray[0] - 97) * (int)Math.pow(26,2) + (charArray[1] - 97) * (int)Math.pow(26,1) + (charArray[2] - 97) * (int)Math.pow(26,0);



        return hashVal;
    }
}
