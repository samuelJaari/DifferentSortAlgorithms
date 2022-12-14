public class QuickSort {
  public static void sort(String[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(String[] arr, int low, int high) {
    if (low >= high) {
      return;
    }

    int pivotIndex = (low + high) / 2;
    String pivotValue = arr[pivotIndex].toLowerCase();

    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i].toLowerCase().compareTo(pivotValue) < 0) {
        i++;
      }

      while (arr[j].toLowerCase().compareTo(pivotValue) > 0) {
        j--;
      }

      if (i <= j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    sort(arr, low, j);
    sort(arr, i, high);
  }
}





  
  
  
  
  
  
