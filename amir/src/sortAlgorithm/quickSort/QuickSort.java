package sortAlgorithm.quickSort;

public class QuickSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i < j){
            // Empty loop body
            while (i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            // Empty loop body
            while (i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        quickSort(myArray , 0, myArray.length);
        for(int elem: myArray){
            System.out.println(elem);
        }
    }

}
