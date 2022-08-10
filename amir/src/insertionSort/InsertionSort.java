package insertionSort;

public class InsertionSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void swap(int[] intArray, int i, int j){
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < myArray.length; i++){
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[i] > myArray[j]){
                    swap(myArray, i, j);
                }
            }
        }

        for(int elem: myArray){
            System.out.println(elem);
        }
    }

}
