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
                System.out.println("Found the princess of hearts.\n");
            }
        }



    }
    
}