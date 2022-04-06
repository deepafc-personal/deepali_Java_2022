package practise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

public class Day21Mar2022 {
    static Scanner sc = new Scanner(System.in);

    public static void ex129(){
        int nums[] = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int result;
        System.out.println("Originl Array " + Arrays.toString(nums));
        result = getSingleNum(nums);
        System.out.println("\n "+ result + " Appears only oncs");
    }
    public static int getSingleNum(int[] nums){
        if (nums==null || nums.length==0){
            return -1;
        }
        int result = 0;
        for (int i = 0; i < nums.length ; i++){
            result ^= nums[i];
        }
        return result;
    }

    static int removeDuplicates(int[] nums){
        if (nums == null){
            return 0;
        }
        if (nums.length<=1){
            return nums.length;
        }
        int curr_position = 0;
        int moving_position;
        for (moving_position =1; moving_position< nums.length; moving_position++){
            if (nums[curr_position] != nums[moving_position]){
                nums[curr_position +1 ] = nums[moving_position];
                curr_position++;
            }
        }
        return curr_position+1;
    }
    public static void ex131(){
        int[] nums= {1,1,1,2,2,2,3,3,3,3,4,4,5,6,7,7};
        System.out.println("Original Array  " + Arrays.toString(nums));
        System.out.println("Length of the Orginal Arrays is " + nums.length);
        System.out.println("After Moving duplicates  "+  removeDuplicates(nums));

    }

    static int remove_duplicate_twice(int[] nums){
        if (nums ==null || nums.length==0){
            return 0;
        }
        int index= 1;
        for (int i = 2; i< nums.length; i++){
            if (nums[i] != nums[index] || (nums[i] == nums[index] && nums[i] != nums[i - 1])){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
    public static void ex132(){
        int[] nums = {1,1,1,1,2,2,2,3,3,3,4,5,5,5,6,7,7,7,7};
        System.out.println("Original Array " + Arrays.toString(nums ) + " Original length " + nums.length);
        System.out.println("After removing duplicates  " + remove_duplicate_twice(nums));
    }
    public static int minPathSum(int[][] grid){
        if (grid == null || grid.length ==0 ||grid[0] == null || grid[0].length ==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m][n];

        for (int i = 0; i< m; i++){
            for (int j = 0 ; j< n ; j++){
                if (i ==0 && j ==0){
                    temp[i][j] = grid[i][j];
                    continue;
                }
                int from_up = i ==0 ? Integer.MAX_VALUE : temp[i-1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j-1];
                temp[i][j] = Math.min(from_left, from_up)  + grid[i][j];
            }
        }
        return temp[m-1][n-1];

    }
    public static void ex133(){
        int[][] grid = new int[][] {{7,4,2},
                                    {0,5,6},
                                    {3,1,2}};
        System.out.println("Sum of all nums along the path is " + minPathSum(grid));
    }
    public static int climbSteps(int n ){
        if(n<=1){
            return 1;
        }
        int[] s_case = new int[n+1];
        s_case[0] =1;
        s_case[1] =1;
        for (int i =2; i<=n ; i++){
            s_case[i] = s_case[i-1] +s_case[i-2];
        }
        return s_case[n];
    }
    public static void ex134(){
        int steps = 5;
        System.out.println("Ways to climb steps " +climbSteps(steps));
    }
    public class LinkedList1{
        Node head;
        class Node{
            int data;
            Node next;
            Node (int d) {data = d; next=null;}

        }
        void remove_duplicates(){
            Node current = head;
            Node next_next;
            if (head==null)
                return;
            while (current.next !=null){
                if (current.data == current.next.data){
                    next_next = current.next.next;
                    current.next = null;
                    current.next = next_next;
                } else
                    current= current.next;

            }

        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);

        Object head = null;
        new_node.next = head;
        head =new_node;

    }
    public static void print_List(){
        Node head = null;
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.data);
            if (temp.next != null){
                System.out.println("- >");
            }
            temp= (Node) temp.next;
        }

        System.out.println("\n");
    }

    public static void ex135(){
        LinkedList l_list = new LinkedList();
        l_list.push(17);
        l_list.push(15);
        l_list.push(16);
        l_list.push(17);
        l_list.push(16);
        l_list.push(18);
        l_list.push(16);
        l_list.push(17);
        l_list.push(16);
        l_list.push(18);

        System.out.println("Orinal List ");
        //l_list.print_List();


    }
    public static void main(String[] args){
        ex134();
    }
}
