public class InsertSort {
    public static void sort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            String temp = arr[i];

            while (j >= 0 && arr[j].toLowerCase().compareTo(temp.toLowerCase()) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }
}




