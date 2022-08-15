package sortAlgorithm.insertionSort;

public class InsertionSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void insertionSort(int[] intArray){
        for(int firsUnsortedIndex = 1; firsUnsortedIndex < intArray.length; firsUnsortedIndex++){
            int newElement = intArray[firsUnsortedIndex];

            int i;

            for (i = firsUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(myArray);
        for(int elem: myArray){
            System.out.println(elem);
        }
    }

}
