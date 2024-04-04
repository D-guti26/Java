public class theOne {
    // defining the findSingle(int[] arr) method that will be called in main.
  public static int findSingle(int[] arr) {
    // declaring variables as int data types as we are working with whole numbers. low is set to zero and high is set to arr.length -1
    int low = 0;
    int high = arr.length - 1;

    // construction of the while loop that will do all the heavy lifting. As long as low < high the loop will continue until the index is found or all the data has been checked
    while (low < high) {
        // assigning mid as an int data type and passing the result of low +(high - low / 2) to mid
        int mid = low + (high - low) / 2;

        // the if conditional statement is checking if the mid is even, if not it will move one index to the left to ensure we always compare pairs.
        if (mid % 2 == 1) mid--;

        // the if conditional statement is checking if mid and mid+1 are the same, if that are a match the index will move to the right half.
        if (arr[mid] == arr[mid + 1]) {
            //  low is programmed to move one index to the right
            low = mid + 2;
            // if both conditional statements are true else statement executes and assigned high = mid
        } else {
            high = mid;
        }
    }

    // When low >= high, the search space is reduced to the unique element.
    return arr[low];
}

public static void main(String[] args) {
    
    int[] testArray = {1, 1, 2, 2, 5, 5, 6, 6, 7, 8, 8, 9, 9};

    System.out.println("The One is: " + findSingle(testArray));
}
}

