public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);
        for (int i: intArray) {
            System.out.println(i);
        }
    }

    // {20, 35, -15, 7, 55, 1, -22};
    public static void mergeSort(int[] inArray, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(inArray, start, mid);
        mergeSort(inArray, mid, end);
        merge(inArray, start, mid, end);
    }

    // {20, 35, -15, 7, 55, 1, -22};
    public static void merge(int[] inArray, int start, int mid, int end) {
        if(inArray[mid - 1] <= inArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = inArray[i] <= inArray[j] ? inArray[i++] : inArray[j++];
        }

        System.arraycopy(inArray, i, inArray, start+ tempIndex, mid - i);
        System.arraycopy(temp, 0, inArray, start, tempIndex);
    }

}
