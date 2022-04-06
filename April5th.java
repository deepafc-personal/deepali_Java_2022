package practise;

import java.util.Arrays;

public class April5th {
    //Delete a specified node in the middle of a singly linked list
    public static ListNode head = new ListNode(10);
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    static void printList(ListNode p){
        while (p != null){
            System.out.println(p.val);
            if (p.next!= null){
                System.out.print("->");
            }
            p = p.next;
        }
    }
    public static void deleteNode(ListNode node){
        if (node.next != null){
            int temp = node.val;
            node.val = node.next.val;;
            node.next.val = temp;

            node.next = node.next.next;
        } else{
               ListNode p = head;
               while (p.next.val != node.val){
                   p =p.next;
               }
               p.next=null;
        }
    }

    public static void ex176(){
        int[] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        System.out.println("Original Array " + Arrays.toString(nums));
        System.out.println("After Partiotion array becomes" );
        int[] result = partitionArray2(nums);
        System.out.println("After Partiotion array becomes " + Arrays.toString(result));
    }

    public static int[] partitionArray2(int[] nums){
        int i =0;
        int j = nums.length-1;
        while (i <j){
            while (nums[i] % 2== 0) i++;
            while (nums[j] % 2 != 0) j--;
            while (i <j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;

    }

    static class TreeNode{
        public int val;
        public TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    private static void traverseTree(TreeNode root){
        if (root != null){
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
        }
    }
    public static TreeNode clonetree(TreeNode root){
        if (root== null){
            return null;
        }
        TreeNode dup = new TreeNode(root.val);
        dup.left = clonetree(root.left);
        dup.right = clonetree(root.right);
        return dup;
    }

    public static int[] plus_one_digit(int[] digits_num){
        for (int i = digits_num.length -1; i> -1; --i){
            if (digits_num[i] !=9){
                digits_num[i] +=1;
                for (int j =i+1; j< digits_num.length; ++j){
                    digits_num[j] =0;
                }
                return digits_num;
            }
        }
        int[] results = new int[digits_num.length+1];
        results[0] =1;
        return results;
    }

    class ListNode1{
        int val;
        ListNode next;
        ListNode1(int x){
            val =x;
        }
    }

    static void printList1(ListNode p){
        while (p !=null){
            System.out.print(p.val);
            if (p.next != null){
                System.out.print("->");
            }
            p = p.next;
        }
    }
    public static ListNode swap_pairs(ListNode head){
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;
        while (head.next != null && head.next.next != null){
            ListNode a = head.next;
            ListNode b = head.next.next;
            head.next = b;
            a.next = b.next;
            b.next =a;
            head= a;
        }
        return temp.next;

    }
    public static int length_last_word(String str1){
        int lenght_word = 0;
        String[] words = str1.split(" ");
        if (words.length>0){
            lenght_word = words[words.length-1].length();
        } else{
            lenght_word = 0;
        }
        return lenght_word;
    }
    public static void ex181(){
        String str1 = "The length of the last word";
        System.out.println("Original String " + str1);
        System.out.println("Length of the last word is " + length_last_word(str1));
    }

    static class TreeNode1{
        public int val;
        public TreeNode left, right;
        public TreeNode1(int val){
            this.val = val;
            this.right = this.left = null;
        }
    }

    public static boolean is_Identical_treeNode(TreeNode a, TreeNode b){
        if (a == null && b== null) return true;
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) return false;
        return is_Identical_treeNode(a.left, b.left) && is_Identical_treeNode(a.right, b.right);

    }
    public static void main(String[] args){
//        head.next = new ListNode(20);
//        head.next.next = new ListNode(30);
//        head.next.next.next = new ListNode(40);
//        head.next.next.next.next = new ListNode(50);
//        ListNode p = head;
//        System.out.println("Origial List");
//        printList(p);
//        System.out.println("After deleteing 4th Node");
//        deleteNode(head.next.next.next);
//        p = head;
//        printList(p);

//        int[] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
//        System.out.println("Original Array " + Arrays.toString(nums));
//        System.out.println("After Partiotion array becomes" );
//        int[] result = partitionArray2(nums);
//        System.out.println("After Partiotion array becomes " + Arrays.toString(result));

//        TreeNode t1 = new TreeNode(1);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        TreeNode t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(5);
//        t1.left = t2;
//        t1.right = t3;
//        t2.left = t4;
//        t2.right = t5;
//        System.out.println("Original TreeNode");
//        traverseTree(t1);
//        System.out.println("\n Clone of The TreeNode");
//        TreeNode result = clonetree(t1);
//        traverseTree(result);

//        int[] nums = {9,9,9,9};
//        System.out.println("Original Array" + Arrays.toString(nums));
//        System.out.println("Arrays of Digits" + Arrays.toString(plus_one_digit(nums)));

//        ListNode l = new ListNode(10);
//        l.next= new ListNode(20);
//        l.next.next = new ListNode(30);
//        l.next.next.next = new ListNode(40);
//        l.next.next.next.next = new ListNode(50);
//        System.out.println("\n Original Linked List");
//        printList(l);
//        System.out.println("After swap");
//        ListNode p = swap_pairs(l);
//        printList(p);

        //ex181();
        TreeNode1 a = new TreeNode1(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);

        TreeNode1 b = new TreeNode1(1);
        b.left = new TreeNode(1);
        b.right = new TreeNode(2);
        b.left.right = new TreeNode(4);

        TreeNode1 c = new TreeNode1(1);
        c.left = new TreeNode(1);
        c.right = new TreeNode(2);
        c.left.right = new TreeNode(4);


    }
}
