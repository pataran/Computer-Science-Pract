public class Main {

    public static void main(String[] args) {

        doubleLinkedList list = new doubleLinkedList();

        list.createList(2);
        list.enqueue(1234);
        list.enqueue(123434);
        list.enqueue(7623);
        list.enqueue(124);

        list.readList();


    }


}
