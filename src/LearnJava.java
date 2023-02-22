import java.util.ArrayList;
import java.util.Arrays;

public class LearnJava {

    public static void mergeSort(int arr[], int n){
        if (n < 2) 
        {return;}

        //[1,4,3,2,5]
        //n=5
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        //copy elements into left subarray
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }

        //copy elements into r subarray
        for (int j = mid; j < n; j++) {
            r[j - mid] = arr[j];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
    
        merge(arr, l, r, mid, n - mid);

    }

    public static void merge(int a[], int l[], int r[], int left, int right){

        int i = 0, j = 0, k = 0;
        while ( i < left && j < right ){
            if (l[i] <= r[j]){
                a[k++] = l[i++];
            }
            else{
                a[k++] = r[j++];
            }
        }
            while(i<left){
                a[k++] = l[i++];
            }
            while(j<right){
                a[k++] = r[j++];
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
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        mergeSort(actual, actual.length);
        System.out.println("Merged: "+Arrays.toString(actual));

    }

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
}
