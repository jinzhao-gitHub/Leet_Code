package com.leetCode;

public class lesson2 {
    /***
     * 两数之和
     *
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     *
     * 你可以按任意顺序返回答案。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] towSum(int[] num,int target){
        int[] a = new int[2];
        for(int i = 0;i<num.length;i++){
            if(num[i]+num[i+1]==target){
                a[0]=num[i];
                a[1]=num[i+1];
                break;
            }else {
                continue;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        lesson2 lesson2 = new lesson2();
        int[] num = {1,2,3};
        int target = 5;
        int[] a = lesson2.towSum(num,target);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
