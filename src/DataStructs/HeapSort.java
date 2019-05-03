package DataStructures;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 10 ,3, 34, 3, 12, 56, 65};

        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.print("Sorted Array is : ");
        printArray(arr);
        System.out.print("Kth smallest elem is : ");
        System.out.println(arr[3 - 1]);
    }

    private void sort(int arr[]) {
        int n = arr.length;

        // build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        // one by one extract an element from heap
        for (int i = n - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest root
        int l = 2 * i + 1; //
        int r = 2 * i + 2;

        // if left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;

        // if largest is not root
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            //Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
