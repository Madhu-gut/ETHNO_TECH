class Node {
    String data;
    Node prev;
    Node next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private Node current;

    public void insert(String data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            System.out.println("Feed started with: " + data );
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        System.out.println("Added to feed: " + data );
    }

    public void next() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("--> Moving Forward...");
            display();
        } else {
            System.out.println("X End of feed. No newer posts.");
        }
    }

    public void prev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("<-- Moving Backward...");
            display();
        } else {
            System.out.println("X Start of feed. Cannot go back.");
        }
    }

    public void delete() {
        if (current == null) {
            System.out.println("X Feed is empty. Nothing to delete.");
            return;
        }

        System.out.println("Deleting current post: " + current.data );
        Node toDelete = current;

        if (toDelete == head && toDelete == tail) {
            head = null;
            tail = null;
            current = null;
        } else if (toDelete == head) {
            head = head.next;
            head.prev = null;
            current = head;
        } else if (toDelete == tail) {
            tail = tail.prev;
            tail.next = null;
            current = tail;
        } else {
            toDelete.prev.next = toDelete.next;
            toDelete.next.prev = toDelete.prev;
            current = toDelete.next;
        }
        
        display();
    }

    public void display() {
        if (current == null) {
            System.out.println("[FEED IS EMPTY]");
        } else {
            System.out.println("[CURRENTLY VIEWING]: " + current.data);
        }
    }
}

public class DoublLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList feed = new DoublyLinkedList();

        System.out.println("--- Populating Feed ---");
        feed.insert("Post 1: Hello world! My first update.");
        feed.insert("Post 2: Check out this picture of my lunch!");
        feed.insert("Post 3: Just finished writing some clean Java code.");
        System.out.println();

        System.out.println("--- Simulating User Navigation ---");
        feed.display(); 
        feed.next();        
        feed.next();        
        feed.next();        
        feed.prev();        
        System.out.println();

        System.out.println("--- Simulating Post Deletion ---");
        feed.delete(); 
        System.out.println();
        
        System.out.println("--- Verifying Feed Structure ---");
        feed.prev();        
        feed.prev();        
    }
}