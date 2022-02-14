import java.util.*;
import java.io.*;
import java.io.IOException;

public class LIFO {
    private int[] elements;
    private int size;

    public LIFO() {
        elements = new int [10];
    }

    public LIFO(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty(){
        if(size == 0)
            return true;
        else
            return false;
    }

    public int peek(){
       return elements[size - 1];
    }

    public void push (int value){
        size ++;
        elements[size - 1] = value;


    }

    public int pop (){
        int number = elements[size - 1];
        size --;
        return number;
    }

    public int getSize(){
        return size;
    }
}