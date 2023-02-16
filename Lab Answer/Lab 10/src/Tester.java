
public class Tester {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int[] arr = {45, 7, 2, 8, 19, 3};
        sort.selectionSortSmallest(arr);
        sort.selectionSortLargest(arr);
        
        int[] arr2 = {10,34,2,56,7,67,88,42};
        sort.insertionSort(arr2);
    }
}
