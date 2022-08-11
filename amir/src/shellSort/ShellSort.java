package shellSort;

public class ShellSort {

    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {20, 35, -15, 7, 55, 1, -22};

    public static void insertionSort(int[] intArray){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
    }

    public static void  shellSort(int[] intArray){
        for(int gap = intArray.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }
    }
    public static void main(String[] args) {
//        insertionSort(myArray);
        shellSort(myArray);
        for (int elem: myArray){
            System.out.println(elem);
        }
    }

}
