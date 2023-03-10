package util;

public class Sort {
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
}
