package practise;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class March27Onwards151 {
    static Scanner sc = new Scanner(System.in);
    public static void ex151(){
        int r1 = (101+0)/3;
        double r2 = 3.0e-6 *  10000000.1;
        boolean r3 = true && true;
        boolean r4 = true && false;
        boolean r5 = (false && false ) || (true && true);
        boolean r6 = (false && false) && (true && true);

        System.out.println(" r1 " + r1 + " r21 " + r2 +"  r3 " + r3 + " r4 " + r4 +"  r5   " + r5+ " r6  " + r6);

    }
    public static void ex152(){
        System.out.println("Input First Number");
        int num1 = sc.nextInt();
        System.out.println("Input second Number");
        int num2 = sc.nextInt();
        System.out.println("Input third Number");
        int num3 = sc.nextInt();
        System.out.println("Input forth Number");
        int num4 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("Numbers are equal ");
        }else{
            System.out.println(" Numbers are not equl");
        }

    }
    public static void ex153(){
        System.out.println("Enter nmber 1 Double");
        double n1 = sc.nextDouble();
        System.out.println("Enter nmber 2 Double");
        double n2 = sc.nextDouble();
        System.out.println(n1>0 && n1< 1 && n2>0 && n2<1);
    }
    public static void ex154(){
        boolean[][] array = {{true, false,true}, {false, true, false}};
        int rows_lenth = array.length;
        int col_length = array[0].length;

        for (int i = 0; i <rows_lenth; i++){
            for (int j = 0; j< col_length; j++){
                if (array[i][j]){
                    System.out.print("  t  ");
                }else {
                    System.out.print("  f  ");
                }
            }
            System.out.println();
        }
    }
    public static void ex155(){
        int[][] two_dim = {{10,20,30},{40,50,60}};
        System.out.println("Original Array ");
        System.out.println(two_dim);
        System.out.println("After chainging the rows and cols ");
        transpose(two_dim);
    }

    public static void transpose(int[][] two_dime){
        int[][] newtwoDim = new int[two_dime[0].length][two_dime.length];
        for (int i =0 ; i< two_dime.length; i++){
            for (int j = 0 ; j< two_dime[0].length; j++){
                newtwoDim[j][i] = two_dime[i][j];
            }
        }
        printArray(newtwoDim);
    }
    public static void printArray(int[][] twoDim){
        for (int i = 0 ; i< twoDim.length; i++){
            for (int j =  0 ; j< twoDim[0].length; j++){
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void  ex156(){
        int n = 2350;
        System.out.println("Originl Number \n % d" + n);
        int shift_right_count = 0;
        do{
            n>>=1;
            shift_right_count++;
        } while (n != 0 );
        shift_right_count--;
        System.out.println("Result %s\r\n " +shift_right_count);
    }
    public static int euclid(int x, int y){
        if (x == 0 || y ==0){
            return 1;
        }
        if (x<y){
            int t = x;
            x= y;
            y = x;
        }
        if( x % y ==0 ){
            return y;
        }else{
            return euclid(y , x % y);
        }
    }
    public static int prime_ceel(int a , int b){
        if (a== 0 || b== 0 ){
            return 1;
        }
        if(a<b){
            int t = a;
            a= b;
            b=t;
        }
        if(a%b==0){
            return b;
        }
        else{
            return prime_ceel(b , a %b);
        }
    }
    public static void ex158(){
        int n = 3;
        boolean[][] A = new
                boolean[n][n];
        for (int i = 0; i <n ; i++){
            for (int j = 0; j<n ; j++){
                A[i][j] = prime_ceel(i, j)==1;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ex159(){
        Integer[] array = new Integer[]{1,3,5,6,7,89,100,12};
        int k = 3;
        System.out.println("Original Arrya " + Arrays.toString(array));
        System.out.println(k + "Largest elements of the array are ");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0; i<k ; i++){
            System.out.print(array[i] + "  ");
        }
    }
    public static void ex1560(){
        Integer[] arr = new Integer[]{1,2,3,4,789,99};
        int k = 3;
        System.out.println("Original Array " + Arrays.toString(arr));
        System.out.println(k + "Smallest elements of the array are");
        Arrays.sort(arr);
        System.out.print(arr[k-1] + " ");
        System.out.println(k + "Largest elements of the array are");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1] +" ");
    }
    public static void ex161(){
        Integer[] nums = new Integer[]{1, 4, 17, 7, 25, 3, 100};
            int sum = 0;
        System.out.println(" Origial array " + Arrays.toString(nums));
        for (int i = 0 ; i<nums.length; i++){
            sum = sum + nums[i];
        }
        double avg = sum/ nums.length;
        System.out.println("Average is " + avg);
        System.out.println("Numbers greter than vag are ");
        for (int i = 0 ; i<nums.length; i++){
            if (nums[i] > avg){
                System.out.println(nums[i]);
            }
        }
    }
    public static int converttoBinary(int n ){
        int ctr = 0;
        String binayNum = Integer.toBinaryString(n);
        System.out.println("Binary Represenattion of "+ n + "is  "+  binayNum);
        for (char ch : binayNum.toCharArray()){
            ctr += ch == '0' ? 1:0;
        }
        return ctr;
    }
    public static void ex163(){
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("\\n Number of 0 bits  " + converttoBinary(n));
    }
    public static float divide_using_substraction(int dividend , int divider){
        if (divider ==0){
            return 0;
        }
        float result = 0;
        while (dividend >divider){
            dividend -=divider;
            result++;
        }
        float decimarlPart = (float) dividend / (float) divider;
        result += decimarlPart;
        return result;
    }
    public static void ex164(){
        System.out.println("Enter Dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter divider");
        int divider = sc.nextInt();
        System.out.println("Result  +" + divide_using_substraction(dividend,divider));
    }
    public static int[] spli_srting_array(int[] nums){
        if (nums==null){
            throw new IllegalArgumentException("Null Array .....");
        }
        boolean flag = true;
        while (flag){
            flag = false;
            for (int j = 0; j < nums.length-1; j++){
                if (nums[j] > nums[j+1]){
                    swap (nums, j , j+1);
                    flag = true;
                }
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int left, int right){
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] =temp;
    }
    public static void ex165(){
        int[] nums = {-2,3,4,-1,-3,1,2,-4,0};
        System.out.println("\n Original Array " + Arrays.toString(nums));
        int[] result = spli_srting_array(nums);
        System.out.println("\n Result " + Arrays.toString(result));
    }
    public static String transform_int_to_string(int n){
        boolean is_negative = false;
        StringBuilder tsb = new StringBuilder();
        if (n==0){
            return  "0";
        } else if (n<0){
            is_negative = true;
        }
        n = Math.abs(n);
        while (n>0){
            tsb.append(n % 10);
            n /=10;
        }
        if (is_negative){
            tsb.append("_");
        }
        return tsb.reverse().toString();
    }
    public static void ex166(){
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println("String format said in Interger " + transform_int_to_string(n));
    }
    public static int[] move_zero(int[] nums){
        if (nums==null){
            throw new IllegalArgumentException("Null array");
        }
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 0; i<nums.length-1; i++){
                if (nums[i] == 0 && nums[i+1] !=0){
                    swap1(nums, i , i+1);
                    swap = true;
                }
            }
        }
        return nums;
    }

    public static void swap1(int[] nums, int a , int b){
        int temp  = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void ex167(){
        int[] nums = {0,3,4,0,1,2,5,0};
        System.out.println("\n Original Arrays   " + Arrays.toString(nums));
        int[] result = move_zero(nums);
        System.out.println("\n Result " + Arrays.toString(result));
    }
    public static void ex168(){
        System.out.println("Enter number 1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        int n2 = sc.nextInt();
        System.out.println("\n Result " + multiply(n1,n2));
    }
    public static int multiply(int n1, int n2){
        int result =0;
        boolean negavtive_num = (n1< 0 && n2>=0 ) || (n2<0 && n1>0);
        boolean positive_num = !negavtive_num;
        n1 = Math.abs(n1);
        for (int i =0; i<n1; i++){
            if (negavtive_num && n2>0 || positive_num && n2<0)
                result -= n2;
            else
                result +=n2;
        }
        return result;
    }
    public static int longest_sequences(int[] nums){
        if(nums == null){
            throw new IllegalArgumentException("Null Array ...");
        }
        if(nums.length==0){
            return 0;
        }
        boolean flag = false;
        int result = 0;
        int start =0, end = 0;
        for (int i = 1; i< nums.length; i++){
            if (nums[i-1] < nums[i]){
                end=i;
            }else{
                start =i;
            }
            if (end-start > result){
                flag= true;
                result = end- start;
            }
        }
        if (flag){
            return result+1;
        }else{
            return result;
        }
    }
    public static void ex169(){
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        System.out.println("Original Array " + Arrays.toString(nums));
        System.out.println(longest_sequences(nums));
    }
    public static String rev_str_buildr(String input_sen){
        if (input_sen ==null){
            throw new IllegalArgumentException("Input Param cannot be null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = input_sen.split(" ");
        for (int i = words.length-1; i>=0; i--){
            stringBuilder.append(words[i]);
            if (i != 0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static void ex170(){
        System.out.println("Input a String");
        String input = sc.nextLine();
        System.out.println("\n Results -> " + rev_str_buildr(input));
    }
    public static boolean is_str_contains(String str1, String str2){
        if (str1== null || str2==null){
            throw new IllegalArgumentException("You cant pass null String");
        }
        boolean ans = false;
        for (int i = 0 ; i< str2.length() -1; i++){
            if (str2.charAt(i) == str1.charAt(0)){
                for (int j = 0; j < str1.length(); j++){
                    if ((i+j) < str2.length() && str1.charAt(j) == str2.charAt(i+j) && j == str1.length()){
                        ans = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public static void ex171(){
        System.out.println("Enter fist String");
        String str1 = sc.nextLine();
        System.out.println("Enter fist String");
        String str2 = sc.nextLine();
        System.out.println("If String1 contains String 2 " + is_str_contains(str1, str2));

    }
    public static void ex172(){
        int[] main_arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ques_arr = {1,4,8};

        ArrayList<Integer> result = count_smallter_numer(main_arr, ques_arr);
        for (int i = 0 ; i< result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<Integer> count_smallter_numer(int[] main_arr, int[] ques_arra){
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(main_arr);
        for (int  i= 0; i< ques_arra.length; i++ ){
            res.add(temp(main_arr, ques_arra[i]));
        }
        return res;
    }

    public static int temp(int[] main_arr, int num){
        int ctr =0;
        for (int i =0; i< main_arr.length; i++){
            if (main_arr[i] <num){
                ctr++;
            } else{
                break;
            }
        }
        return ctr;
    }
    public static void ex173(){
        int[] main_array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k =3;
        System.out.println("Original Array " + Arrays.toString(main_array));
        System.out.println("Value of k " + k);
        System.out.print("Result : ");
        ArrayList<Integer> result = median_slide_window(main_array,k);
        for (int i = 0; i<result.size(); i++){
            System.out.print(result.get(i));
        }
    }

    public static ArrayList<Integer> median_slide_window(int[] main_array, int k){

        ArrayList<Integer> result = new ArrayList<>();
        if (k==0 || main_array.length <k){
            return result;
        }

        PriorityQueue<Integer> right_num = new PriorityQueue<>(k);
        PriorityQueue<Integer> left_num = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i =0; i<k-1; ++i){
            add(right_num,left_num,main_array[i]);
        }
        for (int i = k-1; i< main_array.length; ++i){

            add(right_num,left_num, main_array[i]);
            int median = compute_median(right_num, left_num);
            result.add(median);
            remove(right_num,left_num,main_array[i-k+1]);
        }
        return result;
    }
    private static int compute_median(PriorityQueue<Integer> right_num, PriorityQueue<Integer> left_num){
        if (left_num.isEmpty() && right_num.isEmpty()){
            return 0;
        }
        while (left_num.size()  < right_num.size()){
            left_num.add(right_num.poll());
        }
        while (left_num.size()- right_num.size() > 1){
            right_num.add(left_num.poll());
        }
        return left_num.peek();
    }
    private static void add(PriorityQueue<Integer> right_num, PriorityQueue<Integer> left_num , int num){
        if (left_num.isEmpty() && right_num.isEmpty()){
            left_num.add(num);
            return;
        }else {
            if (num <= compute_median(right_num,left_num)){
                left_num.add(num);
            }else{
                right_num.add(num);
            }
        }
    }

    private static void remove(PriorityQueue<Integer> right_num, PriorityQueue<Integer> left_num , int num){
        if(num <= compute_median(right_num, left_num)){
            left_num.remove(num);
        }else{
            right_num.remove(num);
        }
    }

    public static ArrayList max_slide_window(int[] main_array, int k){
        ArrayList res_array = new ArrayList();
        if (main_array == null || main_array.length ==0 || k<0){
            return res_array;
        }
        Deque deque_num = new LinkedList();
        for (int i =0; i< k ; i++){
            while (!deque_num.isEmpty() && main_array[(int) deque_num.peekLast()] <= main_array[i]){
                deque_num.pollLast();
            }
            deque_num.offerLast(i);
        }
        for (int i = k; i < main_array.length; i++){
            res_array.add(main_array[(int) deque_num.peekFirst()]);
            if (!deque_num.isEmpty() && (int) deque_num.peekFirst() <= (i-k)){
                deque_num.pollFirst();
            }
            while (!deque_num.isEmpty() && main_array[(int) deque_num.peekLast()] <=main_array[i]){
                deque_num.pollLast();
            }
            deque_num.offerLast(i);
        }
        res_array.add(main_array[(int) deque_num.peekFirst()]);
        return res_array;
    }

    public static void ex174(){
        int[] main_array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k =3;
        System.out.println("Original Array " + Arrays.toString(main_array));
        System.out.println("Value of k " + k);
        System.out.println("\n Result ");
        ArrayList result = max_slide_window(main_array,k);
        for (int i =0; i< result.size(); i++){
            System.out.println(result.get(i));
        }
    }
    public static void main(String[] args){
//        System.out.println("result: " + euclid(48, 24));
//        System.out.println("result: " + euclid(125463, 9658));
        ex174();
    }
}
