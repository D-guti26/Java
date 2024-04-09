
// import java.util.Arrays;

public class MyArrayList<T> {
  
  private Object[] elements;
  private int size;
  private final int CAPACITY = 10;
 
  public MyArrayList () {
    // create an array with an initial size of 10
    elements = new Object[CAPACITY]; // initial capacity
    size = 0; // keeps track on number of elements in our array
  }

  /**
   * first check arraylist capacity then
   * adds new elements to arraylist at beginning
   * by moving all the elements to the right one
   * @param elementToAdd
   */
  public void addStart(T elementToAdd) {
    ExpandCapacity();

    for (int i = size; i >= 0; i--) {
      elements[i + 1] = elements[i];
    }
    elements[0] = elementToAdd;
    size++;
  }

  /**
   * checks array to see if it is full or not
   * adds new element to the end of the size of the array
   * @param elementToAdd
   */
  public void addEnd(T elementToAdd) {
    ExpandCapacity();
    elements[size] = elementToAdd;
    size++;
    // check the capacity
  }

  /**
   * increase capacity of the array
   * 
   */
  private void ExpandCapacity() {
    if (size == elements.length) {
       // increase the capacity/size of the array
      Object[] newElement = new Object[elements.length * 2]; // increase array by doubling it
      for (int i = 0; i < size; i++) {
        newElement[i] = elements[i];
      }

      elements = newElement;
    }
  }
  
  /** 
   * print method, for loop iterates through all the elements to print contents
   * 
  */
  public void Print() {
    for(int i = 0; i < size; i++){
      System.out.print(elements[i] + " ");
    }
    System.out.println();
  }

  /**
   * method to add a new entry at specified index. param list the data type being inserted
   * if statement checks to see if user adds an invalid entry, if so adds element to the end of the array
   * else expands array size using ExpandCapacity method 
   * for loop ?
   * @param elementToAdd
   * @param indexToAddAt
   */

  public void AddAtIndex(T elementToAdd, int indexToAddAt){
    if (indexToAddAt > size || indexToAddAt < 0) {
      // throw an error
      // add to index if user addition wants to add an invalid entry
      addEnd(elementToAdd);
    } else {
    ExpandCapacity();

    for (int i = size; i >= 0; i--) {
      elements[i + 1] = elements[i];
    }
    elements[indexToAddAt] = elementToAdd;
    size++;
    }
  }

  /**
   * what functional comment can i add here?
   * @param index
   * @return
   */
  public Object getElementAtIndex(int index) {
    if (index >= size || index < 0) {
      return elements[size -1];
  
    }

      return elements[index];

  }

  public void DeleteAtStart() {
    DeleteAtIndex(0);
  }

  public void DeleteAtEnd() {
    DeleteAtIndex(this.size - 1);
  }

  public void DeleteAtIndex(int indexToDelete) {
    if (indexToDelete < 0 || indexToDelete >= size) {
      throw new IndexOutOfBoundsException("Index " + indexToDelete + "is invalid of ArrayList of size " + size);
    }
    for (int i = indexToDelete; i < size; i ++){ // Start the index where we want to delete
      elements[i] = elements[i + 1]; // current index now empty becomes next index i + 1
    }
    size--; // reduce index size
  }

  public void ClearAll() {
    for (int i = 0; i < size; i++) {
      elements[i] = null;
    }
    size = 0;
  }

  public boolean IsEmpty(){
    return size == 0;
  }

  public int Size(){
    return size;
  }
    
}
