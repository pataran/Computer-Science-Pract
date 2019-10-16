public class doubleLinkedList {
    Node head = null;
    //Tail is updated and stored for every pop,push,enqueue,dequeue for fast access
    Node tail = null;

    public void createList(int val){

        if(this.head == null){

            this.head = createNode(val);
            this.tail = this.head;

        }else{

            System.out.println("list already created!");
        }

    }

    public Node dequeue(){

        Node front = this.head;

        if(this.head == null || this.head.next == null){

            this.head = null;
            this.tail = null;
            System.out.println("queue is empty");

        }else{

            this.head = this.head.next;
            this.head.prev = null;

        }
        return front;


    }
    //Push node to back of list, also used for enqueue
    public void push(int val){

        Node newNode = createNode(val);

        //If item is not pushed onto empty stack else.....
        if(this.head != null) {

            Node tail = this.getTail();
            tail.next = newNode;
            newNode.prev = tail;

        }else{
            //Assign empty stack head to the node
            this.head = newNode;

        }

        this.tail = newNode;

    }

    public Node pop(){

            Node tail = this.getTail();
            Node popped;

            //If tail is null its empty, if tail.prev is empty its the front of the list
            if(tail == null || tail.prev == null){
                System.out.println("list empty");
                popped = tail;

                //List will now be set to empty and popped value return
                this.head = null;
                this.tail = null;

                return popped;

            }else {
                //List was not empty or last element so do a standard head insert.
                this.tail = tail.prev;
                tail.prev.next = null;
                tail.prev = null;

                return tail;
            }

    }

    public void peek(){

        Node tail = this.getTail();

        System.out.println("peek: " + tail.data);

    }

    public void frontPeek(){

        System.out.println("front peek: " + this.head.data);

    }

    public void enqueue(int val){

        push(val);

    }

    public Node getHead(){
        return this.head;
    }

    public Node findTail(){
        Node current = this.head;

        while(current.next != null){
            current = current.next;
        }
        this.tail = current;
        return current;
    }

    public Node getTail(){

        return this.tail;
    }

    public void insertNodeAfter(int preVal,int newVal){

        Node current = this.head;
        Node previous = this.head;
        Node newNode = createNode(newVal);
        Node tail = getTail();

        //If head is null
        if(current == null){

            System.out.println("Cannot insert after on empty list");
        }

        //Insert after head case
        if(current.prev == null && current.data == preVal) {

            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;

        }
           //Insert after tail case
           else if(tail.data == preVal){
                newNode.prev = tail;
                tail.next = newNode;
                this.tail = newNode;
            }

            else {
                //All middle insert cases///////////////////////////////
                while (current.data != preVal && current.next != null) {

                    previous = current;
                    current = current.next;
                }

                    previous.next = newNode;
                    newNode.prev = previous;
                    newNode.next = current;
                    current.prev = newNode;
                ///////////////////////////////////////////////////////
            }

    }

    public void deleteNode(int val) {

        Node current = this.head;
        boolean found = false;

            while (current.data != val && current != getTail()) {

                current = current.next;
            }

        //If the data matches delete by using one of these 3 cases
        if(current.data == val) {

            //If current prev val is null we know its empty or the front of the list
            if (current.prev == null) {

                this.head = current.next;
                this.head.prev = null;

            }
                //If current is equal to the tail delete tail
                else if (current == getTail()) {

                    this.tail = current.prev;
                    current.prev.next = null;
                    current.prev = null;

                }
                    else {

                        current.prev.next = current.next;
                        current.next.prev = current.prev;

                    }
        }

    }

    public Node createNode(int val){

        Node newNode = new Node(val);
        return newNode;

    }

    public void readList(){
       // System.out.println("this is the tail" + getTail().data);
        Node current = this.head;
        while(current != null){

            System.out.println(current.data);
            current = current.next;
        }

    }

    public void readListReverse(){
        System.out.println("Reverse Print");
        Node tail = getTail();
        while(tail != null){
            System.out.println(tail.data);
            tail = tail.prev;
        }

    }

}
