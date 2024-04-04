// Daniel Gutierrez
// Utility Sorting Class
public class DescendingSort {
  
  public static void BubbleSort(Student[] StuArray) { // BubbleSort method in descending order
    
    for (int i = 0; i < StuArray.length - 1; i++){ // For loop iterating through array except the last one

      for (int j = 0; j < StuArray.length - i - 1; j++) { // As elements are sorted fewer elements remain, loop decreases every pass

        if (StuArray[j].getGpa() < StuArray[j  + 1].getGpa()) { // Swap If the current Student's GPA is less than the next Student's GPA
          Student temp = StuArray[j]; // Stores student object so it doesnt get stepped on during the swap
          StuArray[j] = StuArray[j + 1]; // Switch between low GPA and high GPA students
          StuArray[j + 1] = temp; // Student in temp is placed in the array
        }
      }
    }
  }
  public static void SelectionSort(Student[] StuArray){
    int maxIndex; // Used to hold the index of the element with the maximum GPA found during each pass
    
    for (int i = 0; i < StuArray.length; i++){ // Outer loop iterates over each element of the array
      maxIndex = i; // first index is set as highest gpa
      for (int j = i; j < StuArray.length; j ++){ // Inner loop searches for the element with the largest GPA
        if (StuArray[j].getGpa() > StuArray[maxIndex].getGpa()) { // Change from finding minimum to finding maximum
          maxIndex = j; // If a Student with a higher GPA is found, update maxIndex to this new index
          }
        }
        Student temp = StuArray[i]; // Swap the Student with the highest GPA found into the current position i
        StuArray[i] = StuArray[maxIndex];
        StuArray[maxIndex] = temp;
      }
  }

  public static void QuickSort(Student[] StuArray) { // Initiates the QuickSort algorithm for sorting an array of Student objects
    RecursiveQuickSort(StuArray, 0, StuArray.length - 1); // Calls a method to apply QuickSort recursively
}
/**
* Will recursively call itself to perform Quick Sort operation
* @param StuArray the array which should be sorted
* @param low starting index for the current sub array being evaluated
* @param high ending index for the current sub array being evaluated
*/
  public static void RecursiveQuickSort(Student[] StuArray, int low, int high) {
  // this is our condition that lets us know if we need to 
  // continue splitting into sub arrays
        if (low < high) {
          int pivotIndex = Partition(StuArray, low, high);
          RecursiveQuickSort(StuArray, low, pivotIndex - 1);
          RecursiveQuickSort(StuArray, pivotIndex + 1, high);
  }
}
  public static int Partition(Student[] StuArray, int low, int high) { // Partition method for QuickSort
    Student pivot = StuArray[high]; // Pivot
    int i = (low - 1);   // set the position for the smaller element
  /*  j will go through each of the elements in the current sub array being evaluated
  it should start at low and end at high (inclusive)
  */
  for (int j = low; j <= high; j++) {
      if (StuArray[j].getGpa() > pivot.getGpa()) { // Change condition to sort in descending order
          i++;
          Swap(StuArray, i, j); // swap method
          }
        } 
          Swap(StuArray, i + 1, high);
            return i + 1;
          }
  public static void Swap(Student[] StuArray, int index1, int index2) { // swap method for QuickSort
    Student temp = StuArray[index1];
    StuArray[index1] = StuArray[index2];
    StuArray[index2] = temp;
  }
}