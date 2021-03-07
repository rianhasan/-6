R-3.10
public int size(){
    node n = head;
    node m = tail;
    if(n == null){
        return 0;
    }
    int size = 1;
    While(n!=m){
        size++;
        n=n.getNext();
    }
    return size;
}

R-3.15
public class CircularList<T> {
    int length = 0;  
    Element<T> first = null;

    public void add(Element<T> e){
        if (first == null){
            first = e;
            e.next = e;
            e.previous = e;
        } 
        else {
            first.previous.next = e;
            e.previous = first.previous;
            first.previous = e;
            e.next = first;
        }

        this.length
    }
}

 C-3.30 
 
Public  CircularlyLinkedList split (CircularlyLinkedList) {
CircularlyLinkedList M=new CircularlyLinkedList ();
Node temp =L . tail;
For( int i = 1 ; I < L.size () / 2; i++) {
    temp = temp .getNext();
}
M. tail = temp . getNEXT();
temp.setNext (L.tail);
for (int I =0; i<L.size() / 2; i++) {
          temp = temp .getNext();
 } temp.setNext (L.tail);
Return M;
}





