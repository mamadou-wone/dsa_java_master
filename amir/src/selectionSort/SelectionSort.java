package selectionSort;

public class SelectionSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    /**
     *
     * @param intArray
     */
    public static void selectionSort(int[] intArray){
        int lastUnsortedIndex = intArray.length - 1;
        int i = 1;
        for(int k = lastUnsortedIndex; k >= 1; k--){
            int largest = 0;
            int temp;
            for (int j = i; j <= k; j++){
                if(intArray[largest] < intArray[j]){
                    largest = j;
                }
            }
            temp = intArray[k];
            intArray[k] = intArray[largest];
            intArray[largest] = temp;
        }
    }

    public static void main(String[] args) {
        selectionSort(myArray);
        for(int elem: myArray){
            System.out.println(elem);
        }
    }
}
