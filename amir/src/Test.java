public class Test {
    public static int[] arr = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {
        // @Amir
       // System.out.println(factoriel(10));
        int[] intArray = {5, 41, 1, 68, 0};

        insertionSort(intArray);
        for(int i: intArray){
            System.out.println(i);
        }
/*
        int stop = arr.length;
        System.out.println(findMe(5, 0, stop));*/
      //  shellSort(intArray);
    }

    // Merge sort

    public static int findMe(int target, int start, int end){
        int middle = (start + end) / 2;

/*        if(start > end)
            return -1;*/
        if (arr[middle] == target)
            return middle;
        if (arr[middle] < target)
            return findMe(target, start, middle-1);
        if (arr[middle] > target)
            return findMe(target, middle+1, end);
        return -1;
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

    public static void insertionSort(int[] intArray){

        for(int firstUnsotedIndex = 1; firstUnsotedIndex < intArray.length; firstUnsotedIndex++){
            int newElement = intArray[firstUnsotedIndex];
            int i;

            for(i = firstUnsotedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

    }
}
