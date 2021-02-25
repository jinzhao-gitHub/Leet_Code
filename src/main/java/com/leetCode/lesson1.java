package com.leetCode;

public class lesson1 {
    /***
     * 转置矩阵
     *
     * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
     * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
     */
    public int[][] transpose(int[][] matrix) {

        return matrix;
    }


    public static void main(String[] args) {
        int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] o = new int[3][3];
        for(int h = 0;h<i.length;h++){
            int g ;
            for(g = 0 ;g<i[h].length;g++){
                o[g][h] = i[h][g];
                //System.out.println(o[h][g]);
            }
            //System.out.println(o[h]);
        }


        for(int h = 0;h<o.length;h++){
            int g ;
            for(g = 0 ;g<o[h].length;g++){
                //o[g][h] = i[h][g];
                System.out.println(o[h][g]);
            }
            System.out.println(o[h]);
        }
    }
}
