package sortAlgorithm.radixSort;

public class RadixSort {

    /**
     * initial Array that we need to sort
     */
    static int[] myArray = {4725, 4589, 1330, 8792, 1594, 5729};

    public static void main(String[] args) {
        radixSort(myArray, 10, 4);
        for (int elem: myArray){
            System.out.println(elem);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i < width; i ++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];
        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

      //  System.arraycopy(temp, 0, input, 0, numItems);
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return value / (int) Math.pow(radix, position) % radix;
    }

}
