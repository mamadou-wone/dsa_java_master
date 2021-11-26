import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**
         *  Buble sort
         * */
        int[] myArray = {20, 35,-2, 21, -15, 2, 7, 55, 1, -22, -33};
        int count = myArray.length;
        sortArray(myArray, count);

        for (int k : myArray) {
            System.out.println(k);
        }

    }

    public static void sortArray(int[] array, int count){
        int largest = 0;
        while (count >= 1){
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    if (array[i] > array[j]){
                        largest = i;
                    }else{
                        largest = j;
                    }
                    int temp = array[count - 1];
                    array[count - 1] = array[largest];
                    array[largest] = temp;
                }
            }
            count--;
        }
    }
}
