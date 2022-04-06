package practise;

import javax.swing.*;
import java.util.Scanner;

public class Java117Onwards {
    static  Scanner sc = new Scanner(System.in);
    public static void ex117(){
        for (int i =1; i<=100; i++){
            if (i % 3 ==0 && i % 5 ==0){
                System.out.printf("\n %d fizz Buzz ", i);
            } else if (i % 5 ==0){
                System.out.printf("\n %d Buzz ", i );
            } else if (i % 3 ==0){
                System.out.printf("\n % d Fizz" , i);
            }
        }
        System.out.printf("\n");
    }
    public static int sqRootEx117(int num){
        if (num ==0 && num==1){
            return num;
        }
        int a = 0;
        int b = num;
        while (a<=b){
            int mid = (a+b) >>1;
            if (num / mid <mid){
                b = mid -1;
            }else{
                if (num / (mid+1) <= mid)
                    return mid;
            }
            a = mid+1;

        }

        return a;
    }
    public static int strStr(String source, String target){
        if (source ==null || target == null){
            return  -1;
        }
        if ("".equals(target) || source.equals(target)){
        return 0;
        }

        int i =0;
        int last = source.length() - target.length() +1;
        while (i< last){
            if (source.charAt(i) == target.charAt(0)){
                boolean equal = true;
                for (int j = 0; j< target.length() && equal; ++j){
                    if (source.charAt(i+j) != target.charAt(j)){
                        equal= false;
                    }
                }
                if (equal){
                    return i;
                }
            }
            ++i;
        }
        return -1;
    }
    //Get the first occurrence of an element of a given array
    public static void ex119(){
        int[] nums = {2,4,6,7,8,9};
        int target =7;
        int lower = 0;
        int upper = nums.length -1;
        int index = -1;
        while (lower<=upper){
            int mid = (lower+upper) >>1;
            if (nums[mid] == target){
                index = mid;
            }
            if (nums[mid] >= target){
                upper= mid -1;
            }else{
                lower = mid+1;
            }
        }
        System.out.print("Position of Targter is " + target + " is " +index);
    }
    public static boolean searchMatrix(int[][] matrix, int target){
        if (matrix.length==0 || matrix[0].length ==0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int lower = 0;
        int higher = m * n -1;
        while (lower <= higher){
            int mid = (lower+higher) >>1;
            int val = matrix[mid/n][mid %n];
            if (val == target){
                return true;
            } if (val < target){
                lower = mid+1;
            }else{
                higher = mid - 1;
            }
        }
        return false;



    }
    public static void main(String[] args){
        //ex117();
//        int num;
//        System.out.println("Enter is number");
//        int n = sc.nextInt();
//        System.out.printf("\n  Square root of %d is ", n);
//        System.out.println(sqRootEx117(n));

//        String s = "Python";
//        String t ="yt";
//        System.out.printf(String.valueOf(strStr(s,t)));

        //ex119();
        int target = 0;
        int[][] matrix = new int[3][3];
        for (int row =0; row< 3; row++)
            for (int col =0; col<3; col++)
                matrix[row][col] =(1 + row * 3 + col);

            for (int row = 0; row< 3; row++){
                for (int col = 0 ; col <3; col++){
                    System.out.print("Matirx " + matrix[row][col] + " ");
                    if (col==2)
                        System.out.println("");
                }
            }

        System.out.printf(Boolean.toString(searchMatrix(matrix, target)));
    }
}

