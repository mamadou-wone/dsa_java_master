public class Test {
    public static void main(String[] args) {
        // @Amir
        int[] intArray = {12, 56, 98, 14, 0, 3, 6};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement ; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        for (int elem: intArray) {
            System.out.println(elem);
        }
    }
}
