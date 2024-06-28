package locateSmallestWindowToBeSorted1_2;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        //[3,7,5,6,9] return (1,3)
        // [1,3,2,5,4,7,8]
        //System.out.println(Arrays.toString(solution1(new int[] {1,2,3,5,4,6,7})));
        //System.out.println(Arrays.toString(solution1(new int[] {1,3,2,5,4,7,8})));
        //System.out.println(Arrays.toString(solution1(new int[] {3,7,5,6,9})));
        //System.out.println(Arrays.toString(solution1(new int[] {9,1,3,2})));
        //System.out.println(Arrays.toString(solution1(new int[] {1,3,4,5,6,7,8,2,10})));
        System.out.println(Arrays.toString(solution1(new int[] {10, 12, 20, 30, 25, 40, 32, 31, 1, 35, 50, 60})));
    }


    /**
     * Finds the smallest window to be sorted in an unsorted array
     * @param arr
     * @return
     */
    public static int[] solution1(int[] arr) {
        int len = arr.length;
        int leftBound = 0;
        int rightBound = 0;

        // Locate left bound
        int minUnsortedElement = arr[len - 1];
        for(int cur = len - 2, prev = len - 1; cur >= 0; cur--) {
            // Cur is smallest out of place element seen so far
            if (arr[cur] > arr[prev] && arr[cur] < minUnsortedElement) {
                minUnsortedElement = arr[prev];
            }

            if (minUnsortedElement < arr[cur]) {
                leftBound = cur;
            }
            prev = cur;
        }

        // Locate right bound 
        int maxUnsortedElement = arr[0];
        for(int next = 1, prev = 0; next < len ; next++, prev++) {
            if (arr[prev] > arr[next] && arr[prev] > maxUnsortedElement) {
                maxUnsortedElement = arr[prev];
            }

            if (maxUnsortedElement > arr[next]) {
                rightBound = next; 
            }
        }
        

        // Return smallest left index and largest right index
        return new int[] {leftBound, rightBound};
    }
}
