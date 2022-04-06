package practise;

import java.util.Arrays;
import java.util.Scanner;

public class March20Practise {
    static Scanner sc = new Scanner(System.in);
    public static void ex128(){
        int[] nums = {10,2,38,22,38,23};
        System.out.println("Origial Arrya " + Arrays.toString(nums));
        System.out.println("Medium of the arrya is "+ getMedium(nums));
        int[] nums1 = {10,2,38,22,38,23};
        System.out.println("Origial Arrya " + Arrays.toString(nums1));
        System.out.println("Medium of the arrya is "+ getMedium(nums1));
    }

    public static int getMedium(int[] array){

        if (array.length % 2 == 0 ){
            int mid = array.length/2;
            return (array[mid] + array[mid-1]) /2;
        }
        return array[array.length/2];

    }

    public static void sourceArray129(){
        int nums[] = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int result;
        System.out.println(" Source Array " + Arrays.toString(nums));
        result = getSingleNumber(nums);
        System.out.println("\n apperas only once " + result);
    }
    public static int getSingleNumber(int[] nums){
        if (nums == null || nums.length ==0){
            return  -1;
        }
        int result = 0;
        for (int i = 0; i< nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
    public static void main(String[] args){
        sourceArray129();
    }
}
