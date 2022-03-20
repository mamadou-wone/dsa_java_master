public class Test {
    public static void main(String[] args) {
        // @Amir
       // System.out.println(factoriel(10));
        int[] intArray = {5, 41, 1, 68, 0};
        shellSort(intArray);
    }

    public static int factoriel(int num){
        if (num == 0){
            return 1;
        }
        return num * factoriel(num - 1);
    }

    public static void shellSort(int[] intArray){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement ; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        for(int r: intArray){
            System.out.println(r);
        }
    }
}
