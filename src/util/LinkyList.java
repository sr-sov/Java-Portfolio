package util;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkyList {
    public static void runFunc(){
        LinkedList<String> linky = new LinkedList<String>();

        linky.add("Sora");
        linky.add("Riku");
        linky.add("Kairi");

        System.out.println(linky.get(1));

        Iterator<String> it = linky.iterator();

        while(it.hasNext()) {
            if(it.next().equals("Kairi")) {
                System.out.println("Found the princess of hearts at .\n");
            }
        }

        LinkedListStack s = new LinkedListStack();
        s.push("Hello");
        s.push("World");
        System.out.println("Top element: is " + s.top() + "\n");
        System.out.println("Popped element: is " + s.pop() + "\n");
        System.out.println("Popped element: is " + s.pop() + "\n");

    }
    
}