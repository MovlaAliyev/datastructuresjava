package slinkedlist;

import java.util.NoSuchElementException;

public class SLinkedList {
    private Node head;
    private int  size;

    public SLinkedList() {
        head = null;
        size = 0;
    }
    
    private void checkElementIndex(int index){
        if(index < 0 || size == index)
            throw new IndexOutOfBoundsException();
    }
    
    public void addFirst(Object data){
        head = new Node(data, head);
        size++;
    }
    
    public void addLast(Object data){
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
    
    public void add(int index, Object item){
        checkElementIndex(index);
        
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
    
    public void add(Object data){
        addLast(data);
    }
    
    public Object get(int index){
        checkElementIndex(index);
        
        Node node = head;
        for(int i = 0; i < index; i++)
            node = node.next;
        
        return node.data;
    }
    
    public void removeFirst(){
        if(size == 0)
            throw new NoSuchElementException();
        else{
            head = head.next;
            size--;
        }
    }
    
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
    
    public void removeALL(Object data){
        Node node = head;
        for(int i = 0; i < size; node = node.next){
            if(node.data.equals(data)) remove(i);
            else i++;
        }
    }
        
    
    public void set(int index, Object data){
        checkElementIndex(index);
        
        Node node = head;
        for(int i = 0; i < index; i++)
            node = node.next;
        
        node.data = data;
        
    }
    
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    
    
}
