package practise;

import java.util.Arrays;
import java.util.Scanner;

public class java11 {

    static Scanner sc = new Scanner(System.in);
    //58
    public static void practise58(){
        System.out.println("Enter a Sentence");
        String line = sc.nextLine();
        String upper_case_line = ".";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) +word.substring(1) +" ";
        }
        System.out.println(upper_case_line.trim());
    }
    //59
    public static void practse59(){
        System.out.println("Please Enter a String");
        String line = sc.nextLine();
        line = line.toLowerCase();
        System.out.println("Lower ase line is "+ line);
    }
    //60
    public static void findNextToLastWord(){
        System.out.println("Enter a Sentence");
        String line = sc.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("invidual words are ");
        for (int i =0; i< words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Penultimate work is  --> " + words[words.length-2]);

    }
    //61
    public static void reverseAWord(){
        System.out.println("Enter a words to reverse");
        String word = sc.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for (int i = ch.length-1; i>=0; i--){
            result +=ch[i];
        }
        System.out.println("Reverse word --> " + result.trim());

    }
    //62
    public static void practose62(){
        System.out.println("Enter num 1");
        int x = sc.nextInt();
        System.out.println("Enter num 2");
        int y = sc.nextInt();
        System.out.println("Enter num 3");
        int z = sc.nextInt();
        System.out.println((Math.abs(x-y) >=20) || (Math.abs(y-z) >=20) || (Math.abs(x-z) >=20));
    }
    //63
    public static int practise63(int x , int y){

        if(x==y)
                return 0;
        if(x%6 == y % 6 )
            return (x<y) ? x:y;
        return (x>y) ? x:y;
    }
    //64
    public static boolean common_digit(int p , int q){

        if(p<25 || q>75)
            return false;
        int x = p % 10;
        int y = q%10;
        p/=10;
        q/=10;
        return (p==q ||p==y || x==q || x==y);
    }
    //65
    public static void module(){
        System.out.println("Enter first number  - >");
        int a = sc.nextInt();
        System.out.println("Enter Second number  - >");
        int b = sc.nextInt();
        int divided = a/b;
        int result = a -(divided * b);
        System.out.println(result);
    }
    //66
    private static boolean is_prime(int n){
        for (int i =3; i * i <=n; i+=2 ){
            if (n % i ==0){
                return false;
            }

        }
        return true;
    }
    //67
    public static void practise67(){
        String main = " Python 3.0";
        String word = "tutoral";
        System.out.println(main.substring(0,8) + word + main.substring(7));
    }
    //68
    private static void practise68(){
        String main_string= "Python 3.0";
        String last_3_char = main_string.substring(main_string.length()-3);
        System.out.println(last_3_char +last_3_char+last_3_char+last_3_char);
        System.out.println("Length of the hlf of the String -- > " + main_string.substring(0, main_string.length()/2));

        String str1 = "Python";
        String str2 = "Tutoral";

        System.out.println("Concatenate 2 substring");
        System.out.println(str1.substring(1) +str2.substring(1));
        if (str1.length() >=str2.length()){
            System.out.println(str2+str1+str2);
        }else{
            System.out.println(str1+str2+str1);
        }
    }
    //69
    //70
    //71
    //72
    public static void example72(){
        String str1 = "";
        int len = str1.length();
        if(len>=3){
            System.out.println(str1.substring(0,3));
        }else if(len ==1){
            System.out.println(str1.charAt(0) + "##");
        }else{
            System.out.println("###");
        }

    }
    //73
    public static void example73(){
        String str1 = "Python";
        String str2 = "";
        int length2 = str2.length();
        String result = "";
        result += (str1.length()>=1) ? (str1.charAt(0)) : '#';
        result += (length2>=1) ? str2.charAt(length2-1) : '#';
        System.out.println(result);
    }
    //74
    private static void ex74(){
        int[] num_Array = {10, -20,0,30,40,50,50 ,10};
        System.out.println((num_Array[0] ==10 || (num_Array[num_Array.length-1] ==10)));
    }
    //75
    public static void ex75(){
        int[] array ={50,-20,0,30,40,10,60};
        System.out.println(array.length>=2 && array[0] == array[array.length-1]);
    }
    //76
    public static void ex76(){

        int[] num_array ={50, -20, 0 , 30,40,60,12};
        int[] num_array2 = {45, 20, 10, 20, 30, 50, 11};

        if(num_array.length>=2 && num_array2.length>=2){
            System.out.println(num_array[0] == num_array[0] || num_array[num_array.length -1] == num_array2[num_array2.length - 1]);
        }else
        {
            System.out.println("Array length is less than 2");
        }
    }
    //77
    public static void ex77(){
        int[] array1 = {50,-20,0};
        int[] array2 = {5, -50,10};

        System.out.println(" Array1 : " + Arrays.toString(array1));
        System.out.println(" Array2   : " + Arrays.toString(array2));
        int[] new_Array = {array1[0] , array2[2]};
        System.out.println(" New Array  : " + Arrays.toString(new_Array));
    }
    //78
    public static void ex78(){
        int[] array_num = {5,7};
        System.out.println("Arrya is : " + Arrays.toString(array_num));
        if(array_num[0] ==4 || array_num[0] ==7){
            System.out.println("True");
        }else
        {
            System.out.println(array_num[1] ==4  || array_num[1] ==7);
        }

    }
    //79
    public static void reversArray(){
        int[] array_num ={ 20,30,40};
        System.out.println("Original Array : " + Arrays.toString(array_num));
        int[] new_array = {array_num[2], array_num[1], array_num[0]};
        System.out.println("New Array  " + Arrays.toString(new_array));
    }
    //80
    public static void ex80(){
        int[] array = {20,30,40};
        System.out.println("Original Array   " + Arrays.toString(array));
        int max_val = array[0];
        if (array[2] >= max_val)
            max_val = array[2];
        System.out.println("Larger value is  + " + max_val);
    }
    public static void main(String[] args){
       //        practise58();
        //59
       // practse59();
        //60
        //findNextToLastWord();
        //61
        //reverseAWord();
        //62
        //practose62();
        //63
//        System.out.println("Enter first number  - >");
//        int a = sc.nextInt();
//        System.out.println("Enter Second number  - >");
//        int b = sc.nextInt();
        //System.out.println("Result is " + practise63(a,b));
        //64
        //System.out.println("Result is " + common_digit(a,b));
        //65
        //module();
        //66
        int sum = 1;
        int ctr = 0;
        int n = 0;
        while (ctr<100){
            n++;
            if (n%2 !=0){
                if(is_prime(n)){
                    sum+=n;
                }
            }
            ctr++;
        }
        //System.out.println("Sum of prime number till 100 is " + sum);
        //67
       // practise67();
        //68
        //practise68();
        //69
        //70
        //71
        //72
        //example72();
        //73
        //example73();
        //74
        //ex74();
        //75
        //ex75();
        //76
        //ex76();
        //77
        //ex77();
        //78
        //ex78();
        //79
       // reversArray();
        //80
        //ex80();
    }
}
