import java.util.ArrayList;
import java.util.Arrays;

import util.DemoDeque;
import util.LinkyList;
import util.Sort;

public class main {

    //method
    public static void printLowerCaps(String s){
        //concatenation
        System.out.println(s.toLowerCase() + "(lowercase)");
    }
    //method with return
    public static String addString(String s){
        return(s + "+ String");
    }

    public static void doStuff() {
        //if two variables have the same name, priority is on local variable
        int a = 5;
        
        
        for(int i = 0; i<4 ; i++){
            for(int j = 0; j<4; j++){
                a++;
                System.out.println(a);
            }
        }

        //conditional statements
        if(a<20){
            System.out.println("Lower than 20.");
        }
        else{
            System.out.println("Higher than 20.");
        }
    }

    
    public static void main(String[] args) throws Exception {
        //storing data in primitive types
        int a = 1;
        char b = 'i';
        long c = 400;
        double d = 3.2;

        //storing data in non-primitive
        String name = "Jhin";

        System.out.println(name.charAt(a));
        printLowerCaps(name);
        System.out.println(addString(name));

        //class
        //static methods
        System.out.println(Animal.Bark());

        //instance methods
        Animal taroumaru = new Animal();
        System.out.println(taroumaru.getDescription());
        taroumaru.changeDescription("Owner of Komore Teahouse");

        //commonly used object
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        arrInt.add(3);
        arrInt.add(4);
        System.out.println(arrInt);

        doStuff();

        //merge sort
        int[] actual = { 111, 5, 1, 6, 2, 3, 4, 77, 32};
        Sort.mergeSort(actual, actual.length);
        System.out.println("Merged: "+Arrays.toString(actual));
        mergeSortMemory.run(actual, actual.length);
        System.out.println("Merged #2: "+Arrays.toString(actual));

        String s1 = "H";
        String s2 = "I";

        String test = "";
        System.out.println(s1.compareTo(s2));
        
        //util demos
        LinkyList.runFunc();
        DemoDeque.runFunc();

    }

}
