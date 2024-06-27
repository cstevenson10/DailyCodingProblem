package getProductOfAllOtherElements1_1;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        
        test(new int[] {1,2,3,4,5}, new int[] {120,60,40,30,24});
        test(new int[] {3,2,1}, new int[] {2,3,6});
        
    }
    /**
     * Multiply every element of the array then divide the product by it's respective element
     * @param numbers
     * @return 
     */
    public static int[] solution1(int[] numbers) {

        int product = 1; 
        
        for (int num : numbers) {
            product *= num;
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = product / numbers[i];
        }
        return numbers;
    }

    public static void test(int[] test, int[] solution) {
        System.out.println(Arrays.toString(solution));
        System.out.println(Arrays.toString(solution1(test)));
        System.out.println();
    }
}