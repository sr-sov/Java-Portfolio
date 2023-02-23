public class mergeSortMemory {
    //take array and size
    public static void run(int[] arr, int n) {
        //base case
        if(n < 2){
            return;
        }

        //mid split values
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        //get values to form left and right subarray
        for (int i = 0; i < mid; i++){
            l[i] = arr[i];
        }
        for (int j = mid; j < n; j++){
            r[j-mid] = arr[j];
        }

        //split subarrays with recursive calls
        run(l, mid);
        run(r, n-mid);

        //merge subarray
        merge(arr, l, r, mid, n - mid);

    }
    
    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {

        //sort until one array is exhausted
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(l[i] < r[i]){
                arr[k++] = l[i++];
            }
            else{
                arr[k++] = r[j++];
            }
        }
        //add the remainder values
        while(i < left){
            arr[k++] = l[i++];
        }
        while(j < right){
            arr[k++] = r[j++];
        }
    }
    
}
