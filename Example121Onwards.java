package practise;

import java.util.ArrayList;

// date 20 Mar 2022
public class Example121Onwards {
    public static void ex121(){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(max_subaaray(nums));
    }
    public static int max_subaaray(int[] nums){
        if (nums.length<1){
            return 0;
        }
        int max = nums[0];
        int max_begin = 0;
        int max_end = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        while (end < nums.length){
            sum += nums[end];
            if (sum<0){
                sum =0;
                begin = end+1;
            } else{
                if (sum> max){
                    max= sum;
                    max_begin = begin;
                    max_end = end;
                }
            }
            end++;
        }

        return max;
    }
    public static int min_subArray(ArrayList<Integer> nums){
        int[] num1 = new int[nums.size()];
        num1[0] = nums.get(0);
        int min = num1[0];
        for (int i =1; i< nums.size() ; ++i){
            num1[i] = Math.min(nums.get(i), nums.get(i) + num1[i -1] );
            min = Math.min(min, num1[i]);
        }
        return min;
    }
    public static void ex122(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(-2);
        nums.add(1);
        nums.add(-3);
        nums.add(4);
        System.out.println(min_subArray(nums));
    }
    public static void indexSorted124(){

        int[] num1 = {1,2,3,4,5,6};
        int target;
        target =5;
        System.out.println(searchInster(num1 , target));
    }
    public static int searchInster(int[] num1, int target){
        if (num1 == null || num1.length ==0){
            return 0;
        }
        int start = 0;
        int end = num1.length -1;
        int mid = start + (end - start)/2;

       while (start + 1 < end){
           mid = start + (end - start)/2;
           if (num1[mid] == target){
               return mid;
           } else if (num1[mid] > target){
               end = mid;
           } else{
               start = end;
           }
       }
       if (num1[start] >= target){
           return start;
       } else if(num1[start] < target && target <= num1[end]){
           return end;
       } else{
           return end+1;
       }

    }
    public static void main(String args[]){
        indexSorted124();
    }
}
