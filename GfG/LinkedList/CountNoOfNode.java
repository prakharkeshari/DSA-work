package LinkedList;



class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MyLL{

    Node head;

    void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        temp.next = node;
    }
    

    void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }
    void addAtBegginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

    }
    void insertAtMidddle(int data){
        Node node = new Node(data);
       Node temp  = head;
       int counter =0;
       int n =0;
       while(temp!=null){
           counter++;
           temp = temp.next;
       }
       if(counter%2==0){
           n= counter/2;
       }
       else{
           n = (counter/2)+1;
       }
       Node hmph = head;
       for(int i=1;i<n;i++){
            hmph = hmph.next;
       }
       node.next = hmph.next;
       hmph.next = node;

    }
    

}

public class CountNoOfNode {
    public static void main(String[] args) {

        MyLL myll = new MyLL();
        myll.add(10);
        myll.add(20);
        myll.add(30);
      
        myll.insertAtMidddle(0);
        myll.print();
      
         
       
    }
}
