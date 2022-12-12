public class SinglyLinkedList {
    int val;
    SinglyLinkedList next;


    public SinglyLinkedList(int val, SinglyLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public SinglyLinkedList(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
