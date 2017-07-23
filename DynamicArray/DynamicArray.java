package dynamicarray;

import java.util.ArrayList;
import java.util.List;


public class DynamicArray {

    private int SIZE     = 0;
    private int CAPACITY = 2;
    
    private int[] arr = new int[CAPACITY];
    private int[] new_arr;
    
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

   }

}
