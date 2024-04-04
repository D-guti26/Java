// Daniel Gutierrez
public class LinearSearch {

public static int findSingleElement(int[] arr) {

    // Set up the for loop using the basic structure: for(initialization; condition; update)
    // to iterate through the array, checking each element with the next one using a linear approach.
    // variable i is initialized to zero
    // conditional if i is less than arr.length minus the last index then increment i by one
    for (int i = 0; i < arr.length - 1; i++) {

    // Log on the terminal the loop iterating through the array, helps with the picturing!
    System.out.println("Index " + i + " = " + arr[i]);

    // Condition # 1:
    // Set up the if-else statement using basic structure:
    //  if (condition)  
    // Here the condition being passed in reads: 
    // arr[i] != arr[i + 1] : condition checking if the current index is not equal to the next index
    if (arr[i] != arr[i + 1]) {

    // Nested if else statement
    // Condition #2:
    // i == 0 : checks if the current index is zero
    // || : Used to combine boolean conditions of the if statements
    // arr[i] != arr[i - 1] : condition checking if the current index is not equal to the previous index
    if (i == 0 || arr[i] != arr[i - 1]) {

    // if this conditional statement is true then print to terminal the findings 
    System.out.println("Unique element found: " + arr[i]);

    // when either condition is true the program will return the array[index] and terminates the function.
    return arr[i];
    }
    //Increments variable i by one if the current and next elements are equal
    } else {

    // i++ : An additional increment to skip the pairs, this skips re-examination of a second consecutive value
    i++;

    // Print to terminal to provide visual confirmation of pairs
    System.out.println("Element at index " + i + " forms a pair with its neighbor.");
}
}

    // The program will return the last value in the array if no match is found.
    return arr[arr.length - 1];
}
// main method where the program starts running
public static void main(String[] args) {

// defined an array to test the program
int[] testOne = {1, 1, 2, 2, 3, 4, 4, 5, 5}; 
// int[] testTwo = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 24, 25};
// int[] testThree = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 24, 25, 25, 26, 26, 27, 27, 28, 28, 29, 29, 30, 30, 31, 31, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 49, 49, 50, 50, 51, 51, 52, 52, 53, 53, 54, 54, 55, 55, 56, 56, 57, 57, 58, 58, 59, 59, 60, 60, 61, 61, 62, 62, 63, 63, 64, 64, 65, 65, 66, 66, 67, 67, 68, 68, 69, 69, 70, 70, 71, 71, 72, 72, 73, 73, 74, 74, 75, 75, 76, 76, 77, 77, 78, 78, 79, 79, 80, 80, 81, 81, 82, 82, 83, 83, 84, 84, 85, 85, 86, 86, 87, 87, 88, 88, 89, 89, 90, 90, 91, 91, 92, 92, 93, 93, 94, 94, 95, 95, 96, 96, 97, 97, 98, 98, 99, 99, 100};


// calling the findSingleElement() method and passing testOne as an argument
System.out.println(findSingleElement(testOne));
// System.out.println("The unique element is: " + findSingleElement(testTwo));
// System.out.println("The unique element is: " + findSingleElement(testThree));
    }
}






