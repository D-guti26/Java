
public class Main {
  
  public static void main(String[] args) {
    int[] arr = {3, 54, 21, 1, 58, 87, 89, 9000, 2, 1};
    for (int value : arr) {
      System.out.print(" " + value);
      }
    
    // BubbleSort(arr);
    SelectionSort(arr);
    System.out.println();
    
    for (int value : arr) {
    System.out.print(" " + value);
    }

  }

  public static void BubbleSort(int[] arr) {
    int temp;
    for (int i = 0; i < arr.length - 1; i++){
      for (int j = 0; j < arr.length - i - 1; j++) {
        //swapping
        if (arr[j] < arr[j  + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

        }
      }
    }

  }
  public static void SelectionSort(int[] arr){
    int minIndex, temp;
    
    for (int i = 0; i < arr.length; i++){
        minIndex = i;

        for (int j = i; j < arr.length; j ++){
          if (arr[j] < arr[minIndex]) {
            minIndex = j;
          }
        }
        // Swap
        temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
  }
}
public static void QuickSort(int[] arr) {
  RecursiveQuickSort(arr, 0, arr.length - 1);
}

/**
* Will recursively call itself to perform Quick Sort operation
* @param arr the array which should be sorted
* @param low starting index for the current sub array being evaluated
* @param high ending index for the current sub array being evaluated
*/
public static void RecursiveQuickSort(int[] arr, int low, int high) {
  // this is our condition that lets us know if we need to 
  // continue splitting into sub arrays
  if (low < high) {
      int pivotIndex = Partition(arr, low, high);
      RecursiveQuickSort(arr, low, pivotIndex - 1);
      RecursiveQuickSort(arr, pivotIndex + 1, high);
 }
}

public static int Partition(int[] arr, int low, int high) {
  // choose our pivot
  int pivot = arr[high];

  // set the position for the smaller element
  int i = (low - 1);

  /*  j will go through each of the elements in the current sub array being evaluated
  it should start at low and end at high (inclusive)
  */
  for (int j = low; j <= high; j++) {

      if (arr[j] < pivot) {
          i++;
          // swap
          Swap(arr, i, j);
      }
  }

  Swap(arr, i + 1, high);
  return i + 1;
}

public static void Swap(int[] arr, int index1, int index2) {
  int temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
}
