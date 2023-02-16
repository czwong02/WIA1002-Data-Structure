
public class Sorting {

    public Sorting() {
    }
    
    public void selectionSortSmallest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        for(int x:arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public void selectionSortLargest(int[] arr) {
        for (int i = arr.length-1; i < 0; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(currentMin < arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
        for(int x:arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
    public void insertionSort(int[] arr) {
        for (int i = 1; i<arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for(k = i -1; k >= 0 && arr[k] > currentElement; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
        }
        for(int x:arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
