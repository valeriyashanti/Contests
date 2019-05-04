import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKthSortedArrays {

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


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int [][] arr = new int[amount][];

        for (int i = 0; i < amount; i++){
            int n = sc.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(tester.mergeKSortedArrays(arr));
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
    static void printArray(int arr[])
    {
        int n = arr.length;

        if (n == 0)
            System.out.println();
        else if (n == 1)
            System.out.println(arr[0]);
        else {
            int t = -1;
            for (int i = 0; i < n - 1; ++i) {
                if (t != arr[i]) {
                    System.out.print(arr[i] + " ");
                    t = arr[i];
                }
            }
            System.out.print(arr[arr.length - 1]);
        }
    }
}

