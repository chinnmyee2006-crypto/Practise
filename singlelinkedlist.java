package DSA;

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class singlelinkedlist {
    node head;

    public void insert(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlelinkedlist list = new singlelinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List Elements:");
        list.display();
    }
    
}
