package LinkedLists;

public class SinglyLL<T> {
    Node<T> head;
    Node<T> tail;
    int l = 0;

    public void addFirst(T d){
        Node<T> n = new Node<>();
        n.data = d;
        l++;
        if(head==null && tail==null){
            head = n;
            tail = n;
        }
        else {
            n.next = head;
            head = n;
        }
    }

    public void addLast(T d){
        Node<T> n = new Node<>();
        n.data = d;
        l++;
        if(head==null && tail==null){
            head = n;
            tail = n;
        }
        else {
            tail.next = n;
            tail = n;
        }
    }

    public void add(int pos, T d){
        Node<T> n = new Node<>();
        n.data = d;
        if(pos>l){
            System.out.println("Invalid Index");
            return;
        }
        l++;
        if(head==null && tail==null){
            head = n;
            tail = n;
        }
        else if(pos == 0){
            n.next = head;
            head = n;
        }
        else {
            Node<T> temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;

            if(temp == tail){
                tail = n;
            }
        }
    }

    public void display(){
        Node<T> temp = head;

        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void last(){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        System.out.println(tail.data);
    }

    public void removeFirst(){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        if(head == tail){
            l--;
            head = null;
            tail = null;
        }
        else{
            l--;
            head = head.next;
        }
    }

    public void removeLast(){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        if(head == tail){
            l--;
            head = null;
            tail = null;
        }
        else{
            l--;
            Node<T> temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void removeAt(int pos){
        if(head==null && tail==null){
            System.out.println("List Empty");
            return;
        }
        else if(pos == 0){
            l--;
            head = head.next;
        }
        else{
            Node<T> temp = head;
            for(int i = 0; i<pos-1; i++){
                temp = temp.next;
            }
            if(temp.next == tail){
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


