package dynamicarray;

import java.util.ArrayList;
import java.util.List;


public class DynamicArray {

    private int SIZE     = 0;
    private int CAPACITY = 2;
    
    private int[] arr = new int[CAPACITY];
    private int[] new_arr;
    
    
    
    public void push(int index, int value){
        if(index < 0)
            throw new ArrayIndexOutOfBoundsException();
        
       
            
    }
    
    public int get(int index){
        if(index < 0 || index >= SIZE) 
            throw new ArrayIndexOutOfBoundsException();
        
        return arr[index];
    }
    
    public void remove(int index){
        if(index < 0 || index >= SIZE)
            throw new ArrayIndexOutOfBoundsException();
        
        for(int i = index; i <= (SIZE - 2); i++)
            arr[i] = arr[i+1];
        SIZE = SIZE - 1;    
    }
    
    public void push(int value){
        if(SIZE == CAPACITY){
            new_arr = allocate();
            for(int i = 0; i <= (SIZE - 1); i++)
                new_arr[i] = arr[i];
            
            CAPACITY = CAPACITY * 2;
            arr      = new_arr;
        }
        arr[SIZE] = value;
        SIZE     = SIZE + 1;
    }
    
    private int[] allocate(){
        new_arr = new int[2 * CAPACITY];
        return new_arr;
    }
    
    public void pop(){
        if(SIZE == 0) 
            throw new ArrayIndexOutOfBoundsException();
        
        SIZE = SIZE - 1;
    }
    
    
    
    public int size() {
        return SIZE;
    }

    public static void main(String[] args) {
       
        List<Integer> list = new ArrayList<>();
        
        list.add(0, 1);
        
        System.out.println(list.get(0));
        
        
        DynamicArray array = new DynamicArray();
        array.push(1);
        array.push(2);
        array.push(3);
        
        
        System.out.println("Before delete");
        //for(int i = 0; i <= array.size(); i++)
            //System.out.println(array.get(i));
            
        //array.remove(0);
        array.pop();
        
        System.out.println("After delete");
        for(int i = 0; i < array.size(); i++)
            System.out.println(array.get(i));
        
        System.out.println("Array Size: " + array.size());
    }

}
