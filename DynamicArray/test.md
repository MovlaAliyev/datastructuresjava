```
public void test(){}
```
```
public class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}
```
```
public class SLinkedList {

    private Node head;
    private int  size;

    /*
    * Construktor işə düşən zaman başlanğıc pointeri(head) null a point eirik (çünki heç 1 node yaranmıyıb)
    * ölçünü(size) isə 0 a bərabər edirik 
    */
    public SLinkedList() {
        head = null;
        size = 0;
    }
    
    private void checkElementIndex(int index){
        if(index < 0 || size == index)
            throw new IndexOutOfBoundsException();
    }
    
    /*
    * addFirst funksiyyası bağlı listin əvvəlinə əlavə edir
    * və ölçünü 1 vahid artırır
    */
    public void addFirst(int data){
        head = new Node(data, head);
        size++;
    }
    /*
    * addLast funksiyyası bağlı listin sonuna əlavə edir
    * və ölçünü 1 vahid artırır
    */
    public void addLast(int data){
        /*
        * head == null burada əgər list boşdusa əvvələ əlavə et funksiyyası cağrılır
        * əks halda else blokunda node head a point edir yəni listin başlanğıcına
        * və döngüdə null a point edən node ye qədər davam edir(sonuncu elemenrə qədər)
        * tapıldığında yeni node yaradır dəyəri ora atır və əvvəlki (null a point edən) node ni yni yaranan nodeye point etdirir yeni           * yarananı isə null a
        */
        if(head == null)
            addFirst(data);
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node(data, node.next);
            size++;
        }
    }
    
     /*
     * add funksiyyası verilən indexə əlavə edir
     */
    public void add(int index, int item){
        checkElementIndex(index); // əgər veriln index mövcud deyilsə exception döndürür
        
        /*
        * əgər mövcuddursa verilən indexi tapır və pointerləri ona uyğun dəyişir
        */ 
        if(index == 0)
            addFirst(item);
        else{
            Node node = head;
            for(int i = 0; i < index; i++){
                node = node.next;
            }
            node.next = new Node(item, node.next);
            size++;
        }
    }
    
    public void add(int data){
        addLast(data);
    }
    
     /*
     * get funksiyyası verilən indexə görə datanl verir
     */
    public int get(int index){
        checkElementIndex(index);
        
        Node node = head;
        for(int i = 0; i < index; i++)
            node = node.next;
        
        return node.data;
    }
    
     /*
     * ilk data nı silir head i növbəti node point edir və size 1 vahid azaldır
     */
    public void removeFirst(){
        if(size == 0)
            throw new NoSuchElementException();
        else{
            head = head.next;
            size--;
        }
    }
     /*
     * sonuncu datanı silir və onnan əvvəlki node ni null a point edir
     * əgər 1 data varsa removeFirst funksiyyasln cağırır
     */
    public void removeLast(){
        if(head.next == null)
            removeFirst();
        else{
            Node node = head;
            while(node.next != null)
                node = node.next;
            
            node.next = null;
            size--;
        }
    }
    
    /*
     * verilən indexdəki datanı silir
     
     */
    public void remove(int index){
        checkElementIndex(index);
        
        if(index == 0)
            removeFirst();
        else{
            Node node = head;
        
            for(int i = 0; i < index - 1; i++)
                node = node.next;
        
            node.next = node.next.next;
            size--;
        }
        
    }
   
    /*
     * listən bütün data nı silir
     *
     */
   public void clear(){
        head = null;
        size = 0;
    }
    /*
     * listin ölçüsün döndürür
     
     */
    public int size(){
        return size;
    }
    
}
```
