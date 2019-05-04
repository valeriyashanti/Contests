import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKthSortedArrays {
    /* public static void main(String[] args) {
//        int[] a = {1, 3, 4, 5, 6,  8, 11};
//        int[] b = {5, 5, 5, 6, 9, 10, 23 ,56};
//        int[] c = {1, 1, 1, 3, 6, 7, 11, 12 ,23, 435};
        new MergeKthSortedArrays().run();
    } */

    private class HeapNode {
        int arrayNum;
        int index;
        int value;

        public HeapNode(int arrayNum, int index, int value) {
            this.arrayNum = arrayNum;
            this.index = index;
            this.value = value;
        }
    }

    static MergeKthSortedArrays  tester = new MergeKthSortedArrays();


    public static void main(String args[]) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        int amount = Integer.parseInt(sc.nextLine());

        int [][] arr = new int[amount][];

        for (int i = 0; i < amount; i++){
            String[] line = sc.nextLine().trim().split(" ");
            arr[i] = new int[line.length];
            for (int j=0; j<line.length; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        int [] output = tester.mergeKSortedArrays(arr);

        System.out.println(Arrays.toString(output));
    }



    public int[] mergeKSortedArrays(int[][] arr){
        if (arr == null) return null;

        PriorityQueue<HeapNode> minHeap = new PriorityQueue<>
                (arr.length, (HeapNode a, HeapNode b) -> a.value - b.value);
        int size = 0;
        for (int i = 0; i < arr.length; i++){
            size += arr[i].length;
        }
        int []res = new int[size];  // k * n

        // add first elem to heap
        for (int i = 0; i < arr.length; i++){
            minHeap.add(new HeapNode(i,0,arr[i][0]));
        }

        for (int i = 0; i < size; i++){
            HeapNode node = minHeap.poll();

            if (node != null){
                res[i] = node.value;
                if (node.index + 1 < arr[node.arrayNum].length){
                    minHeap.add(new HeapNode(
                            node.arrayNum,
                            node.index + 1,
                            arr[node.arrayNum][node.index + 1]));
                }
            }
        }
        return res;
    }



    /*
    public void sort(int[][] a) {
        int n = a.length;

        for (int j = 0; j < a.length; j++) {
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(a[j], n, i);

            for (int i = n - 1; i >= 0; i--) {
                int temp = a[j][0];
                a[j][0] = a[j][i];
                a[j][i] = temp;

                heapify(a[j], i, 0);
            }
        }
    }

    private void heapify(int[] a, int n, int i) {

        int large = i;
        int l = 2 * i + 1;
        int r = 2 + i + 2;

        // If left child is larger than root
        if (l < n && a[l] > a[large])
            large = l;

        // If right child is larger than largest so far
        if (r < n && a[r] > a[large])
            large = r;

        if (large != i){
            int s = a[i];
            a[i] = a[large];
            a[large] = s;
            heapify(a, n , l);
        }
    }
    */

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


}
