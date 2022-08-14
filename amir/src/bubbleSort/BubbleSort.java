package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void swap(int[] intArray, int i, int j){
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    /**
     * Bubble Sort implementation
     * @param intArray the array tha we need to sort
     * @param option is the order that we need to sort the array (0: for Ascending, otherwise the array will be sorted in Descending order)
     */
    public static void bubbleSort(int [] intArray, int option){
        int temp;
        if (option == 0){
            for(int i = 0; i < intArray.length; i++){
                for (int j = i + 1; j < intArray.length; j++){
                    if(intArray[i] > intArray[j]){
                        temp = intArray[i];
                        intArray[i] = intArray[j];
                        intArray[j] = temp;
                    }
                }
            }
        }else{
            for(int i = intArray.length - 1; i >= 0; i--){
                for (int j = i - 1; j >= 0; j--){
                    if(intArray[i] > intArray[j]){
                        temp = intArray[i];
                        intArray[i] = intArray[j];
                        intArray[j] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
//        bubbleSort(myArray, 1);
//        for (int elem: myArray) {
//            System.out.println(elem);
//        }
//        System.out.println("***************************************");
//        bubbleSort(myArray, 0);
        Arrays.sort(myArray);
        for (int elem: myArray) {
            System.out.println(elem);
        }

    }

}
