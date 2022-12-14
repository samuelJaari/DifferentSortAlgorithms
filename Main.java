import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "words.txt";
        List<String> words = readWordsFromFile("moby.txt");
    
        String[] arr = words.toArray(new String[words.size()]);
    
        System.out.println("Original array: " + Arrays.toString(arr));
        
        System.out.println();

        InsertSort.sort(arr);
        System.out.println("Insert sort: " + Arrays.toString(arr));
    
        arr = words.toArray(new String[words.size()]);
        MergeSort.sort(arr);
        System.out.println("Merge sort: " + Arrays.toString(arr));
    
        arr = words.toArray(new String[words.size()]);
        QuickSort.sort(arr);
        System.out.println("Quick sort: " + Arrays.toString(arr));
      }
    
      private static List<String> readWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
          String line;
    
          while ((line = br.readLine()) != null) {
            String[] lineWords = line.split(" ");
            words.addAll(Arrays.asList(lineWords));
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
    
        return words;
      }
}



