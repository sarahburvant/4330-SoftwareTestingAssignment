package softwareTesingProject;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SortingTest {

    //testing a regular/expected case 
    @Test
    public void expected_cases(){
        //testing positive values
        Sort test1 = new Sort();
        int[] testArray1 = {64, 25, 12, 22, 11};
        int[] actualArray1 = {11, 12, 22, 25, 64};
        assertArrayEquals(test1.selectionSort(testArray1), actualArray1);

        //testing negative values
        int[] testArray2 = {-25, -64, -12, 22, 11};
        int[] actualArray2 = {-64, -25, -12, 11, 22};
        assertArrayEquals(test1.selectionSort(testArray2), actualArray2);
    }

    //testing incorrect cases
    @Test
    public void incorrect_cases(){
        Sort test = new Sort();
        int[] testArray1 = {64, 25, 12, 22, 11};
        int[] testArray2 = {64, 25, 12, 22, 11};
        assertNotEquals(testArray2, test.selectionSort(testArray1));
    }




//testing a big array
    @Test
    public void size_testing(){
        Sort test = new Sort();
        int[] unsortedArray = {
            87, 5, 34, 22, 73, 60, 13, 11, 46, 39,
            62, 59, 40, 51, 26, 97, 76, 72, 20, 91,
            3, 70, 17, 90, 66, 43, 68, 47, 38, 32,
            80, 19, 69, 64, 24, 33, 8, 86, 56, 35,
            79, 75, 31, 48, 61, 41, 53, 54, 57, 96,
            30, 25, 52, 74, 9, 28, 50, 21, 18, 93,
            71, 44, 12, 1, 77, 63, 4, 37, 98, 55, 14,
            45, 67, 36, 42, 29, 10, 58, 82, 15, 2,
            16, 83, 85, 84, 27, 65, 88, 94, 92,
            95, 99, 100, 49, 78, 23, 6, 7, 81, 89};

        int[] actualArray1 = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
        21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
        51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
        61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 
        71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
        81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 
        91, 92, 93, 94, 95, 96, 97, 98, 99, 100
    };

    assertArrayEquals(test.selectionSort(unsortedArray), actualArray1);
}

@Test
    public void boundary_cases(){
        Sort test1 = new Sort();

        //test for empty array
        int[] emptyArray = {};
        assertArrayEquals(test1.selectionSort(emptyArray), emptyArray);

        //testing an array with a single integer
        int[] singleArray = {0};
        assertArrayEquals(test1.selectionSort(singleArray), singleArray);

        //testing already sorted array
        int[] sorted = {0, 1, 2, 10, 25, 90};
        assertArrayEquals(test1.selectionSort(sorted), sorted);

        //testing reverse-sorted array
        int[] reverse_sorted = {90, 25, 10, 2, 1, 0};
        assertArrayEquals(test1.selectionSort(reverse_sorted), sorted);

        //array with duplicates
        int[] unsorted1 = {1, 1, 1, 1, 0, 0, 0, 1, 1, 0};
        int[] sorted1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(test1.selectionSort(unsorted1), sorted1);
    }

    //running the algorithm on the same array
    @Test
    public void idempotency_cases(){
        Sort test1 = new Sort();
        int[] unsorted = {64, 25, 12, 22, 11, 27, 49, 100};
        int[] unsorted_copy = {64, 25, 12, 22, 11, 27, 49, 100};
        assertArrayEquals(test1.selectionSort(unsorted), test1.selectionSort(unsorted_copy));
    }


}