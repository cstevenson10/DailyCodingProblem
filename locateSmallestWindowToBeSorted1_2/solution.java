package locateSmallestWindowToBeSorted1_2;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        //[3,7,5,6,9] return (1,3)
        // [1,3,2,5,4,7,8]
        System.out.println(Arrays.toString(solution1(new int[] {1,2,3,5,4,6,7})));
        System.out.println(Arrays.toString(solution1(new int[] {1,3,2,5,4,7,8})));
        System.out.println(Arrays.toString(solution1(new int[] {3,7,5,6,9})));
        System.out.println(Arrays.toString(solution1(new int[] {9,1,3,2})));
    }


    /**
     * Finds the smallest window to be sorted in an unsorted array
     * Note: This solution assumes there is an unsorted window
     * @param arr
     * @return
     */
    public static int[] solution1(int[] arr) {
        int leftBound = 0;
        int rightBound = 0;

        // Find left must unsorted pair
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                leftBound = i;
                rightBound = i + 1;
                break;
            }
        }

        // Find right most unsorted pair
        for(int i = leftBound + 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                rightBound = i + 1;
            }
            else if (arr[leftBound] > arr[i]) {
                rightBound = i;
            }
        }

        // Return smallest left index and largest right index
        return new int[] {leftBound, rightBound};
    }
}
