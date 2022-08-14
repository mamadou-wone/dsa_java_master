package insertionSort;

public class RecursiveInsertionSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void sort(int[] input, int firstUnsortedIndex){
        int newElement = input[firstUnsortedIndex];
        int i;
        for (i = firstUnsortedIndex; i > 0 && input[i - 1] > newElement; i--){
            input[i] = input[i - 1];
        }
        input[i] = newElement;
        firstUnsortedIndex++;
        if (firstUnsortedIndex < input.length)
            sort(input, firstUnsortedIndex);
    }

    public static void main(String[] args) {
        sort(myArray, 1);
        for(int elem: myArray){
            System.out.println(elem);
        }
    }

}
