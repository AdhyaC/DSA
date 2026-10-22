package LinkedLists;

public class CircularLL<T> {
    Node<T> head;
    Node<T> tail;
    int l = 0;

    public void addFirst(T d) {
        Node<T> n = new Node<>();
        n.data = d;
        l++;
        if (head == null && tail == null) {
            head = n;
            tail = n;
            tail.next = head;
        } else {
            n.next = head;
            head = n;
            tail.next = n;

        }
    }

    public void addLast(T d){
        Node<T> n = new Node<>();
        n.data = d;
        l++;
        if(head==null && tail==null){
            head = n;
            tail = n;
            n.next = head;
        }
        else{
            n.next = head;
            tail.next = n;
            tail = n;
            }
        }
        public void add(int pos, T d){
        Node<T> n = new Node<>();
        n.data = d;
        l++;
        if(head==null && tail==null){
            head = n;
            tail = n;
            n.next = head;
        }
        else if(pos==0){
            n.next = head;
            head = n;
            tail.next = n;
        }
        else{
            Node<T> temp = head;
            for(int i = 0; i<pos-1;i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            if(temp == tail){
                tail = n;
            }
        }
    }
    public void display() {
        if (head == null && tail == null) {
            System.out.println("List Empty");
            return;
        } else {
            Node<T> temp = head;
            for(int i = 0; i<l; i++){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void remFirst(){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        l--;
        if(head==tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }
    public void remLast(){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        l--;
        if(head==tail){
            head = null;
            tail = null;
        }
        else{
            Node<T> temp = head;
            while(temp.next.next!=head){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }
    public void remove(int pos){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        if(head==tail && pos==0){
            head = null;
            tail = null;
            l--;
        }
        else if(pos==0){
            head = head.next;
            tail.next = head;
            l--;
        }
        else{
            Node<T> temp = head;
            for(int i = 0; i<pos-1;i++){
                temp = temp.next;
            }
            if(temp.next==tail){
                tail = temp;
            }
            temp.next = temp.next.next;
            l--;
        }
    }
    public void length(){
        System.out.println("Length:"+l);
    }
}