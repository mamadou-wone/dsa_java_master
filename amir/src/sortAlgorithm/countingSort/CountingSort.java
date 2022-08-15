package sortAlgorithm.countingSort;

public class CountingSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];

         for (int i = 0; i < input.length; i++){
             countArray[input[i] - min]++;
         }
         int j = 0;
        for (int i = min; i <= max ; i++) {
            while (countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        countingSort(myArray, 0, 10);
        for (int elem: myArray){
            System.out.println(elem);
        }
    }
}
