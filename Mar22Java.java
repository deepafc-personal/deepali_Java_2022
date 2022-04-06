package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Mar22Java {
    public static int uniquePath(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] grid = new int[m][n];
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                grid[i][j] = get_Paths(grid, i, j);
            }
        }
        return grid[0][0];
    }

    private static int get_Paths(int[][] grid, int i, int j) {
        if (i >= grid.length - 1 || j >= grid[0].length - 1) {
            return 1;
        }
        return grid[i][j + 1] + grid[i + 1][j];
    }

    static ArrayList<String> longestWord(String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }

    public static void ex137(){
        String[] dic = {"cat", "flag", "green", "country", "w3resource"};
        System.out.println("Original Dictionary " + Arrays.toString(dic));
        System.out.println("Longest word os " + longestWord(dic));

    }

    //Java Pro Number To Do Number -->139  Still Left --> 32
    public static void ex139(){
        int[] nums = {1,2,3,-6,5,4};
        System.out.println("Original Array " + Arrays.toString(nums));
        System.out.println("Index of the subarray where sum of the index is 0 " + subArraySum(nums));
    }

    public static List<Integer> subArraySum(int[] nums){
        List<Integer> temp = new ArrayList<>();
        if (nums== null || nums.length==0){
            return temp;
        }

        int pre_sum =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(pre_sum, -1);
        for (int i = 0; i < nums.length; i++){
            pre_sum +=nums[i];
            if (map.containsKey(pre_sum)){
                temp.add(map.get(pre_sum) +1);
                temp.add(i);
                return temp;
            }
            map.put(pre_sum,i);
        }
        return temp;
    }
    //Java Pro Number To Do Number -->140  Still Left --> 31
    //Merge all overlapping Intervals from a given a collection of intervals
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals){

        if (intervals.size() == 0 || intervals.size() ==1)
            return intervals;

        Collections.sort(intervals, new IntervalComparator());
        Interval first = intervals.get(0);
        int start = first.getStart();
        int end = first.getEnd();

        ArrayList<Interval> results = new ArrayList<Interval>();
        for (int i = 1; i < intervals.size() ; i++){
            Interval current = intervals.get(i);
            if (current.getStart() <= end){
                end = Math.max(current.getEnd() , end);
            } else{
                results.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        results.add(new Interval(start , end));
        return results;
    }

    static class Interval{
        private int start;
        private int end;

        Interval(){
            start =0;
            end =0;
        }
        Interval(int s , int e){
            start =s;
            end = e;
        }
        public int getStart(){
            return start;
        }
        public int getEnd(){
            return end;
        }
    }

    static class IntervalComparator implements Comparator<Interval>{
        public int compare(Interval i1, Interval i2){
            return i1.getStart() - i2.getStart();
        }
    }


    //Java Pro Number To Do Number -->141  Still Left --> 30
    public static boolean is_Unique(String str){
        char[] chr = str.toCharArray();

        for (int i = 1; i< chr.length; ++i){
            if (chr[i] == chr[i-1]){
                return false;
            }
        }

        return true;
    }
    //Java Pro Number To Do Number -->142  Still Left --> 29
    public static boolean anagram_test(String str1, String str2){
        if (str1 == null || str2 == null){
            return false;
        } else if (str1.length() != str2.length()){
            return false;
        } else if (str1.length() == 0 && str2.length() == 0){
            return true;
        }

        int[] count = new int[256];
        for (int i = 0 ; i< str1.length() ; i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int num : count){
            if (num != 0 ){
                return false;
            }
        }

        return true;
    }
    public static void ex1422(){
        String str1 = "wxyz";
        String str2 = "zyxw";
        System.out.println("String 1 " + str1 + "String 2 " + str2);
        System.out.println("Check if two given strings are anagrams or not?: " + anagram_test(str1, str2));
    }
    //Java Pro Number To Do Number -->143  Still Left --> 28
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode lis1, ListNode list2){
        ListNode head = new ListNode(0);
        ListNode mlist = head;
        while (lis1 != null && list2 != null){
            if (lis1.val < list2.val){
                mlist.next = new ListNode(lis1.val);
                mlist = mlist.next;
                lis1 = lis1.next;
            } else{
                mlist.next = new ListNode(list2.val);
                mlist = mlist.next;
                list2 = list2.next;
            }
        }
        while (lis1 != null){
            mlist.next = new ListNode(lis1.val);
            mlist = mlist.next;
            lis1 = lis1.next;
        }
        while (list2 != null){
            mlist.next = new ListNode(list2.val);
            mlist = mlist.next;
            list2 = list2.next;
        }
        head= head.next;
        return head;
    }
    public static void ex143(){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(31);
        list1.next.next = new ListNode(5);
        list1.next.next.next.next = new ListNode(8);
        list1.next.next.next.next.next = new ListNode(10);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(40);
        ListNode head = mergeTwoLists(list1,list2);
        System.out.println("Merged Lists are \n");
        while (head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }

    }

    //Java Pro Number To Do Number -->144  Still Left --> 27
    public static int removeElement(int[] nums, int elem){
        int length = nums.length;
        if (length==0 ) return 0;
        int i = 0;
        for (int j =0; j< nums.length; j++){
            if (nums[j] != elem){
                nums[i] = nums[j];
                i++;
            }
        }
        if (i< length) nums[i] ='\0';
        return i;

    }
    public static void ex144(){
        int x = 6;
        int[] nums = {1,4,6,7,6,3,2};
        System.out.println("OOriginal Array " + Arrays.toString(nums));
        System.out.println("Lenth of new array is after removng duplicates " + removeElement(nums, x));
    }
    //Java Pro Number To Do Number -->145  Still Left --> 26
    class LlistNode145{

        int val;
        ListNode next;
        void ListNode145(int val){

            this.val = val;
            this.next = null;
        }
    }
    public static ListNode removeNthElement(ListNode head, int n){
        ListNode p = head;
        int size = 0;
        while (p != null){
            size++;
            p = p.next;
        }
        if (n == size){
            head = head.next;
        }else{
            int index = size- n;
            ListNode t = head;
            while (index > 1){
                t = t.next;
                index--;
            }
            t.next = t.next.next;
        }
        return head;
    }
    public static void esx144(){
        ListNode h = new ListNode(1);
    }
    //Java Pro Number To Do Number -->146  Still Left --> 25
    //Java Pro Number To Do Number -->147  Still Left --> 24
    //Java Pro Number To Do Number -->148  Still Left --> 23
    //Java Pro Number To Do Number -->149  Still Left --> 22
    //Java Pro Number To Do Number -->150  Still Left --> 21
    //Java Pro Number To Do Number -->151  Still Left --> 20
    //Java Pro Number To Do Number -->152  Still Left --> 19
    //Java Pro Number To Do Number -->153  Still Left --> 18
    //Java Pro Number To Do Number -->154  Still Left --> 17
    //Java Pro Number To Do Number -->155  Still Left --> 16
    //Java Pro Number To Do Number -->156  Still Left --> 15
    //Java Pro Number To Do Number -->157  Still Left --> 14
    //Java Pro Number To Do Number -->158  Still Left --> 13
    //Java Pro Number To Do Number -->159  Still Left --> 12
    //Java Pro Number To Do Number -->160  Still Left --> 11
    //Java Pro Number To Do Number -->161  Still Left --> 10
    //Java Pro Number To Do Number -->162  Still Left --> 9
    //Java Pro Number To Do Number -->163  Still Left --> 8
    //Java Pro Number To Do Number -->164  Still Left --> 7
    //Java Pro Number To Do Number -->165  Still Left --> 6
    //Java Pro Number To Do Number -->166  Still Left --> 5
    //Java Pro Number To Do Number -->167  Still Left --> 4
    //Java Pro Number To Do Number -->168  Still Left --> 3
    //Java Pro Number To Do Number -->169  Still Left --> 2
    //Java Pro Number To Do Number -->170  Still Left --> 1

    public static void main(String[] args) throws java.lang.Exception
    {
        int m =3;
        int n =2;
        //System.out.println("Unique paths are " + uniquePath(m,n));

        // 22 March from 136 - 170 , more 33 programe
        //ex137();
        // more 32
        //Java Pro Number To Do Number -->139  Still Left --> 32
        //ex139();
        //Java Pro Number To Do Number -->140  Still Left --> 31 Merge all overlapping Intervals from a given a collection of intervals
//        ArrayList<Interval> x = new ArrayList<>();
//        x.add(new Interval(1,3));
//        x.add(new Interval(2,6));
//        x.add(new Interval(8,10));
//        x.add(new Interval(15,18));
//        x.add(new Interval(17,30));
//        x.add(new Interval(20,31));
//
//        x = merge(x);
//
//        for (Interval i : x){
//            System.out.println(i.getStart() + " " + i.getEnd());
//        }

        //Java Pro Number To Do Number -->141  Still Left --> 30
//        String str = "xyz";
//        System.out.println("Orignal String " + str);
//        System.out.println("Has all Uniq char " + is_Unique(str));
        //Java Pro Number To Do Number -->142  Still Left --> 29
       // ex1422();
        //Java Pro Number To Do Number -->143  Still Left --> 28
        //ex143();
        //Java Pro Number To Do Number -->144  Still Left --> 27
        ex144();
        //Java Pro Number To Do Number -->145  Still Left --> 26
        //Java Pro Number To Do Number -->146  Still Left --> 25
        //Java Pro Number To Do Number -->147  Still Left --> 24
        //Java Pro Number To Do Number -->148  Still Left --> 23
        //Java Pro Number To Do Number -->149  Still Left --> 22
        //Java Pro Number To Do Number -->150  Still Left --> 21
        //Java Pro Number To Do Number -->151  Still Left --> 20
        //Java Pro Number To Do Number -->152  Still Left --> 19
        //Java Pro Number To Do Number -->153  Still Left --> 18
        //Java Pro Number To Do Number -->154  Still Left --> 17
        //Java Pro Number To Do Number -->155  Still Left --> 16
        //Java Pro Number To Do Number -->156  Still Left --> 15
        //Java Pro Number To Do Number -->157  Still Left --> 14
        //Java Pro Number To Do Number -->158  Still Left --> 13
        //Java Pro Number To Do Number -->159  Still Left --> 12
        //Java Pro Number To Do Number -->160  Still Left --> 11
        //Java Pro Number To Do Number -->161  Still Left --> 10
        //Java Pro Number To Do Number -->162  Still Left --> 9
        //Java Pro Number To Do Number -->163  Still Left --> 8
        //Java Pro Number To Do Number -->164  Still Left --> 7
        //Java Pro Number To Do Number -->165  Still Left --> 6
        //Java Pro Number To Do Number -->166  Still Left --> 5
        //Java Pro Number To Do Number -->167  Still Left --> 4
        //Java Pro Number To Do Number -->168  Still Left --> 3
        //Java Pro Number To Do Number -->169  Still Left --> 2
        //Java Pro Number To Do Number -->170  Still Left --> 1

    }
}
