package practise;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Java81onwards {
    static Scanner sc = new Scanner(System.in);
    public static void ex81(){
        int[] array_num = {20,30,40};
        System.out.println("Original Array  " + Arrays.toString(array_num));
        int x = array_num[0];
        array_num[0] = array_num[array_num.length-1];
        array_num[array_num.length-1] =x;
        System.out.println("New Array after swap   " + Arrays.toString(array_num));

    }
    public static void ex82(){
        int[] array_num = {20,30,40,50,67};
        System.out.println("original Array " + Arrays.toString(array_num));
        int max_val = array_num[0];
        if (max_val <= array_num[array_num.length-1])
            max_val = array_num[array_num.length-1];
        if (max_val <array_num[array_num.length/2])
            max_val = array_num[array_num.length/2];
        System.out.println("Largest between firxt last and moddile valie is " + max_val);
    }
    public static void ex83(){
        String result = "";
        int[] left_array = {1,3,-5,4};
        int[] right_array = {1,4,-5,-5};
        System.out.println("\n Array1 " + Arrays.toString(left_array));
        System.out.println("\n Array 2" + Arrays.toString(right_array));
        for (int i = 0; i< left_array.length ; i++){
            int num1 = left_array[i];
            int num2 = right_array[i];
            result += Integer.toString(num1 * num2) + " ";
        }
        System.out.println("Result  " + result);
    }
    public static void ex84(){
        String string1 = "Python";
        int slenghth = 3;
        if (slenghth >string1.length()){
            slenghth = string1.length();
        }

        String subPart = string1.substring(string1.length()-3);
        System.out.println(subPart+string1+subPart);
    }
    public static void ex85(){
        String name = "Hello How are you?";
        System.out.println(name.startsWith("Hello"));
    }
    public static void ex86(){
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        while (n!=1){
            if(n%2==0){
                n = n/2;
            }
            else{
                n = (3 *(n+1)) /2;
            }
        }
        System.out.println("\n Value of n is " + n);
        sc.close();
    }

    public static void print_number(int n ){
        int x, y , z;
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Digits of the said num is " + n);
        if (n<10){
            System.out.println(number[n]);
        }
        else if (n<100){
            x =n /10;
            y = n - x * 10;
            System.out.println("In English : " + number[x] + "   " + number[y]  );
        }
        else {
            x = n/100;
            y = (n -x * 100 )/10;
            z = n - x * 100 - y * 10;
            System.out.println("In English : " + number[x] + "   " + number[y]  + "   " + number[z]);
        }

    }

    public static void ex88(){
        System.out.println("\n Current Sys env");
        System.out.println(System.getenv());
        System.out.println("\n \n System Properties");
        System.out.println(System.getProperties());
    }

    public static void ex89To95(){
        System.out.println("Security manager installed or Not");
        System.out.println(System.getSecurityManager());
        System.out.println("Env Variavle Path");
        System.out.println(System.getenv("PATH"));
        System.out.println("Env Variable Temp");
        System.out.println(System.getenv("TEMP"));
        System.out.println("Envir Variavle UserName");
        System.out.println(System.getenv("USERNAME"));
    }

    public static void ex91(){
        long startTime = System.nanoTime();
        int i;
        System.out.println("The first 10 natural numbers are");
        for ( i = 0; i<=10; i++){
            System.out.println(i);
        }

        long estimateTime = System.nanoTime() - startTime;
        System.out.println("Estimate time in navoSeconds is  "+ estimateTime);
    }

    public static void CountEvenOddArray(){
        int[] numns= {5,7,2,9,4};
        int ctr_even = 0, ctr_odd = 0;
        System.out.println("Original Array " + Arrays.toString(numns));
        for (int i = 0; i< numns.length; i++){
            if (numns[i] % 2 ==0){
                ctr_even++;
            }
            else
                ctr_odd++;
            }
        System.out.println("\n Numbers of even are %d" + ctr_even);
        System.out.println("\n Number of Odds are %d " + ctr_odd);
        System.out.println("\n");
    }

    public static void ex93(){
        int[] nums = { 10,10,2,4,20,20};
        System.out.println("Origianl Arrat is " + Arrays.toString(nums));
        int ctr_even =0, ctr_odd =0;
        boolean found1010 = false;
        boolean found2020 = false;

        for (int i =0; i< nums.length -1; i++){
            if (nums[i] ==10 && nums[i+1] ==10)
                found1010 = true;

            if (nums[i] ==20 && nums[i+1] ==20)
                found2020 = true;
        }
        System.out.printf(String.valueOf(found1010 != found2020));
        System.out.println("\n");

    }

    public static void oddEvenArray(){
        int[] arrau_nums ={1,2,3,4,56,89,13,15,2,4,6,3,9,57};
        int i = 0;
        System.out.println("Original Array is " + Arrays.toString(arrau_nums));
        while (i< arrau_nums.length && arrau_nums[i] % 2 ==0)
            i++;
        for (int j = i+1 ; j< arrau_nums.length; j++){
            if (arrau_nums[j] % 2 != 0 ){
                int temp = arrau_nums[i];
                arrau_nums[i] = arrau_nums[j];
                arrau_nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array is " + Arrays.toString(arrau_nums));
    }

    public static void ex95(){
        int n = 5;
        String[] array_string = new String[n];

        for (int i = 0; i<n ; i++){
            array_string[i] = String.valueOf(i);

        }            System.out.println("New Array is " + Arrays.toString(array_string));
    }

    public static void ex96(){
        int[] array_num = {10, 20, 30 ,80, 50, 20, 13, 50};
        boolean tested = false;
        int result = 0;
        int x = 10;
        int y = 20;
        for (int i = 0; i< array_num.length; i++){
            if (array_num[i ] == x)
                tested = true;

            if(tested && array_num[i] ==y){
                System.out.printf(String.valueOf(true));
                result =1;
            }
        }
        if (result==0){
            System.out.printf(String.valueOf(false));
        }
        System.out.printf("\n");
    }

    public static void ex97(){
        int[] array1 = {10, 20, 10, 50, 20, 13, 50};
        boolean tested = false;
        int result = 0;
        int x = 10;
        for (int i = 0 ; i< array1.length-1 ; i++){
            if (array1[i] == x && array1[i+1]==x)
            {
                System.out.println(String.valueOf(true));
                result = 1;
            }

            if (i<= array1.length -3 && array1[i] == x && array1[i+2] == x){
                System.out.println(String.valueOf(true));
                result =1;
            }
        }
        if (result==0){
            System.out.println(String.valueOf(false));
        }
        System.out.println("\n");
    }

    public static void ex98(){
        int[] array1 = {10, 20, 10, 20, 40, 13, 20};
        int count = 0, result = 0;
        if (array1.length>=1 && array1[0] ==20)
            count++;

        for (int i = 1; i < array1.length; i++){
            if (array1[i-1] == 20 && array1[i] ==20){
                System.out.printf(String.valueOf(false));
                result = 1;
            }
            if (array1[i] == 20)
                count++;
        }
        if (result==0){
            System.out.printf(String.valueOf(count==3));
        }
        System.out.printf("\n");
    }

    public static void ex99(){
        int[] array1 = {10,20,30,20,40,20,50};
        int result = 0;
        int x = 20;
        for (int i =0; i< array1.length-1 ; i++){
            if (array1[i] != x && array1[i+1]!= x){
                result = 1;
            }
            if (result ==0 ){
                System.out.println(String.valueOf(false));
            }else
            {
                System.out.println(String.valueOf(true));
            }
        }
    }

    public static void ex100(){
        int[] array1 ={10, 11, 10, 20, 43, 20, 50};
        int[] array2 ={10, 13, 11, 20, 44, 30, 50};

        System.out.println("Array 1 " + Arrays.toString(array1));
        System.out.println("Array2 " + Arrays.toString(array2));



        int ctr = 0;
        for (int i = 0; i < array1.length; i++){
            if (Math.abs(array1[i] - array2[i]) <= 1 && array1[i] != array2[i])
                ctr++;
        }
        System.out.printf("Number of Elements " + ctr);
        System.out.printf("\n");
    }

    public static void ex101(){
        int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
        int result = 0;
        System.out.println("Original Array : " + Arrays.toString(array_nums));

        int ctr1 = 0;
        int ctr2 = 0;
        for (int i = 0 ; i< array_nums.length; i++){
            if (array_nums[i] ==10)
                ctr1++;
            if (array_nums[i]==20)
                ctr2++;
        }
        System.out.printf(String.valueOf(ctr1>ctr2));
        System.out.printf("\n");
    }
    public static void ex102(){
        int[] arrya_nums = {11, 11, 13, 31, 45, 20, 33, 53};
        int result =1;
        System.out.println("Original Array : " + Arrays.toString(arrya_nums));

        for (int i = 0; i< arrya_nums.length; i++){
            if (arrya_nums[i] ==10 || arrya_nums[i] ==30){
                result =0;
            }
        }
        if (result==1){
            System.out.printf(String.valueOf(false));
        }else {
            System.out.printf(String.valueOf(true));
        }
    }
    public static void ex103(){
        int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53};
        int result = 0;
        System.out.println("Original Array  " + Arrays.toString(array_nums));
        int l = array_nums.length-1;
        int[] new_array;
        while (array_nums[l]!=10)
            l--;

        new_array= new int[array_nums.length-1-l];
        for (int i = l+1; i< array_nums.length; i++)
            new_array[i-1-l] =array_nums[i];
        System.out.println("New Array " + Arrays.toString(new_array));

    }

    public static void ex104(){
        int[] array_nums = {11, 15, 13, 10, 45, 20, 33, 53};
        int result = 0;
        System.out.println("Original Array " + Arrays.toString(array_nums));
        int l =  0;
        int[] new_array;
        while (array_nums[l] !=10)
            l++;
        new_array = new int[l];
        for (int i = 0; i<l; i++){
            new_array[i] = array_nums[i];
        }
        System.out.println("New Array " + Arrays.toString(new_array));

    }

    public static void ex105(){
        int[] array_nums= {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Original Array " + Arrays.toString(array_nums));
        int result = 0;
        int l =2;
        int start =0;
        int end = array_nums.length-1;
        for (; l>0 ; l--){
            if (array_nums[start] != array_nums[end])
                result = 1;
            else {
                start++;
                end++;

            }
        }
        if (result==1){
            System.out.printf(String.valueOf(false));
        }
        else
        {
            System.out.printf(String.valueOf(true));
        }
        System.out.println("\n");
    }
    public static void leftshifted106(){
        int[] array_nums = {11, 15, 13, 10, 45, 20};
        System.out.println("Original Array " + Arrays.toString(array_nums));

        if (array_nums.length >1){
            int first = array_nums[0];
            for (int i =1; i< array_nums.length; i++)
                array_nums[i-1] = array_nums[i];

            array_nums[array_nums.length -1 ] = first;
            System.out.println("New Array " + Arrays.toString(array_nums));
        }
    }
    public static void ex107(){
        int[] array_num = {11, 12, 13, 14, 45, 20};
        System.out.println("Original Array " + Arrays.toString(array_num));
        int result = 1;
        for (int i = 0; i<= array_num.length-3; i++){
            if (array_num[i] +1 == array_num[i+1] && array_num[i+1] + 1 == array_num[i+2])
                result =0;
        }

        if (result==1){
            System.out.printf(String.valueOf(false));
        } else{
            System.out.printf(String.valueOf(true));
        }
        System.out.println("\n");
    }
    public static void ex110(){
        int test = 0;
        System.out.println("Input a Positive Integer : ");
        int n = sc.nextInt();
        if (n < 1){
            System.out.print(Boolean.toString(false));
            test =1;
        }
        if ((n & (n-1)) != 0 ){
            System.out.print(Boolean.toString(false));
            test = 1;
        }
        if (test==0){
            System.out.print(Boolean.toString((n & 0x55555555) != 0));
        }
        System.out.println("\n");
    }
    public static void ex111(){
        int x, y;
        System.out.println("Input first number");
        x = sc.nextInt();
        System.out.println("Input second number");
        y = sc.nextInt();
        while (y !=0){
            int carry = x & y;
            x = x ^y;
            y = carry<<1;
        }
        System.out.println("Sum : " + x);
        System.out.println("\n");
    }
    public static void ex112(){
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int n1 = n;
        long ctr = 0;
        while (n != 0 ){
            ctr += n/5;
            n/=5;
        }
        System.out.printf("Number of trailing zeros in the factorial %d %d " + n1, ctr);
        System.out.printf("\n");
    }
    public static void ex113(){
        int arrya1[] = new int[8];
        arrya1[0] =1;
        arrya1[1] =2;
        arrya1[2] =3;
        arrya1[3] =4;
        int[] array2 = {2,5,6,7};
        System.out.println("Array1 " + Arrays.toString(arrya1));
        System.out.println("Array 2 " + Arrays.toString(array2));

        int m = 4, n= 4;
        int i = m-1 , j = n-1, index = m+n-1;
        while (i>=0 && j>=0) {
            if (arrya1[i] > array2[j]) {
                arrya1[index--] = arrya1[i--];
            } else {
                arrya1[index--] = arrya1[j--];
            }
        }
        while (i >=0){
            arrya1[index--] =arrya1[i--];
        }
        while (j>=0){
            arrya1[index--] = array2[j--];
        }
        System.out.println("Meregd array" + Arrays.toString(arrya1));
    }
    public static void reverse(char[] str, int start, int end){
        while (start<end) {
            char temp = str[start];
            str[start] =str[end];
            str[end] =temp;
            start++;
            end--;
        }
    }

    public static int reverse_num(int n){
        int reverse = 0;
        while (n !=0){
            reverse *=10;
            reverse +=n%10;
            n/=10;

        }
        return reverse;
    }
    public static boolean palindrome(int n){

        return (n == reverse_num(n));
    }
    public static void main(String[] args){
        //ex86();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try{
//            int sum = 0;
//            String str = br.readLine();
//            char[] numStr = str.toCharArray();
//            for (int i = 0; i< numStr.length; i++){
//                sum += numStr[i] - '0';
//            }
//            System.out.println("riginal Number " + str);
//            print_number(sum);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //leftshifted106();
        //System.out.println("Input a Positive Interger");
        //int n = sc.nextInt();
//        if (n>0){
//            System.out.print("The Single digit is " + (n== 0 ? 0 : (n %9 ==0 ? 9 : n % 9)));
//        }
//        System.out.println("\n");

        //ex107();

//        if (n>0){
//            System.out.println("Number of rows : " + ((int)((Math.sqrt(8 * (long) n+1) -1) /2)));
//        }
        //ex112();
       // ex113();
//        String str = "abcdef";
//        char[] A = str.toCharArray();
//        int offset = 3;
//        int len = A.length;
//        offset %=len;
//        reverse(A, 0 ,len-offset-1);
//        reverse(A, len-offset,len-1);
//        reverse(A, 0 , len-1);
//        System.out.println("\n" + Arrays.toString(A));

        System.out.println("Enter a Positive Int");
        int n = sc.nextInt();
        System.out.printf(" Is %d it a Palindrome? \n " , n);
        System.out.println(palindrome(n));
    }
}
