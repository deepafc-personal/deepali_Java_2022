package practise;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.List;

public class Mar24th {

    //145
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode p = head;
        int size = 0;
        while (p!= null){
            size++;
            p = p.next;
        }

        if (n == size){
            head = head.next;
        }else{
            int index = size-n;
            ListNode t = head;
            while (index>1){
                t = t.next;
                index--;
            }
            t.next = t.next.next;
        }
        return head;
    }
    public static void ex145(){
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
        ListNode o = h;
        System.out.println("Original Node");
        while (o != null){
            System.out.print(o.val +" ");
            o = o.next;
        }
        System.out.println("\nAfter Removing second element from the list");
        ListNode head = removeNthFromEnd(h,2);
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }

    }
    //146
    static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = left.right = null;
        }

    }

    public static void ex146(){
        int[] arr = {1,2,3,4,5,6};
        TreeNode root = sortedArrayToBst(arr);
        trverseTree(root);
    }
    public static TreeNode sortedArrayToBst(int[] arr){
        if(arr.length == 0 ) return null;
        return creation(arr, 0 , arr.length-1);
    }

    public static TreeNode creation(int[] arr, int start, int end){
        TreeNode node = new TreeNode(0);
        if (start == end-1){
            node = new TreeNode(arr[start]);
            node.right = new TreeNode(arr[end]);
        } else if(start==end){
            return new TreeNode(arr[start]);
        } else {
            int mid = (start+end )/2;
            node.val = arr[mid];
            node.left = creation(arr, start, mid-1);
            node.right = creation(arr, mid+1, end);
        }
        return node;
    }
    private static void trverseTree(TreeNode root){
        if (root != null){
            trverseTree(root.left);
            trverseTree(root.right);
            System.out.println(root.val);
        }
    }
    // 147
    public static int first_uniq_char(String s){
        int[] fre = new int[256];
        for (char c : s.toCharArray()){
            fre[c = 'a']++;
        }
        for (int i = 0; i<s.length(); i++){
            if (fre[s.charAt(i) - 'a'] ==1) return i;
        }
        return -1;
    }
    // 148
    public static boolean stringPermutation(String s1, String s2){
        int[] arr = new int[500];
        for (int i = 0; i< s1.length(); i++){
            arr[(int) s1.charAt(i)] +=1;
        }
        for (int i = 0 ; i< s2.length(); i++){
            arr[(int) s2.charAt(i)] -=1;
        }
        for (int  i=0; i<arr.length;i++){
            if (arr[i] !=0) return false;
        }
        return true;
    }
    // 149
    // 150
    static class TreeNode1{

        public int val;
        public TreeNode1 left;
        public TreeNode1 right;
        public TreeNode1(int val){
            this.val =val;
            this.left = this.right = null;
        }
    }
    public static boolean is_Subtree(TreeNode1 T1, TreeNode1 T2){
        if (T2==null) return true;
        if (T1==null) return false;
        if (is_same(T1,T2)) return true;
        if (is_Subtree(T1.left, T2) || is_Subtree(T1.right, T2)) return true;
        return false;
    }
    public static boolean is_same(TreeNode1 t1, TreeNode1 t2){
        if (t1==null || t2==null){
            return t1==t2;
        } else if(t1.val != t2.val){
            return false;
        }else {
            return is_same(t1.left, t2.left) && is_same(t1.right , t2.right);
        }

    }
    // 151
    // 152
    // 153
    // 154
    //155



    public static void main(String[] args){
        //145
        //ex145();
        //146
        //ex146();
        // 147
//        String s = "wresource";
//        System.out.println("Original String " + s);
//        System.out.println("First Unique character above  " + first_uniq_char(s));
        // 148
        String str1 = "xxyz";
        String str2 = "yxzx";
//        System.out.println("original String " + " " + str1 + " " + str2);
//        System.out.println("stringPermutation  " + stringPermutation(str1,str2));
        // 149
        // 150
        TreeNode1 t1= new TreeNode1(1);
        TreeNode1 t2= new TreeNode1(2);
        TreeNode1 t3= new TreeNode1(3);
        TreeNode1 t4= new TreeNode1(4);
        TreeNode1 t5= new TreeNode1(5);

        t1.left= t2;
        t1.right=t3;
        TreeNode1 n1 = new TreeNode1(1);
        TreeNode1 n2 = new TreeNode1(2);
        TreeNode1 n3 = new TreeNode1(3);
        TreeNode1 n4 = new TreeNode1(4);
        n1.left = n2;
        n1.right= n3;
        System.out.println(is_Subtree(t1,n1));

        // 151
        // 152
        // 153
        // 154
        //155

    }
}
