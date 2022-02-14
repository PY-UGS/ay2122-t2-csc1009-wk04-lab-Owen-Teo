import java.util.*;
import java.io.*;
import java.io.IOException;

public class LIFOTest {
    public static void main(String[] args){
        LIFO stack = new LIFO();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
