package com.example.test.arithmetic.PackageProblem;


/**
 * 01背包问题 将重量为(w1,w2,w3,w4,w5...)、价值为(v1,v2,v3,v4,v5...)的物品放入容量为N的背包中，怎样放价值最大
 * 动态规划：
 * 我们设v[i][j]为放入前i个物品到容量为j的背包中的最大值，i一定是小于物品总个数的，j一定是小于N的
 * 举个例子 v[2][5]表示将前两个物品放入容量为5的背包中的最大价值 v[2][6]表示将前两个物品放入容量为6的背包中的最大价值
 * 则有等式：
 * v[0][j] = v[j][0] = 0
 * v[i][j] = v[i-1][j] w[i]>j
 * v[i][j] = Max(v[i-1][j],v[i-1][j-w[i]]+value[i]) w[i] <= j
 * 暴力求解：
 * 求出物品个数的所有子集，计算每一个子集的价值，选出最大值
 * 例如有4个物品，那么2^4=16个子集，每个子集有四位，每一位是0代表该子集中没有该物品，是1代表有该物品
 * 0 0 0 0 代表该子集中没有任何物品
 * 0 1 0 1 代表该子集中有2号物品和4号物品
 */
public class Package_01 {

    /**
     * 动态规划
     *
     * @param weight
     * @param value
     * @param capacity
     * @return
     */
    public static int maxValue(int[] weight, int[] value, int capacity) {
        int weightLen = weight.length;
        int valueLen = capacity + 1;//列值长度加1，是因为最后一列要保证重量值为lenColumn
        int maxValue = 0;
        int[][] v = new int[weightLen][valueLen];


        // 遍历背包的承重
        for (int j = 0; j <= capacity; j++) {
            // 遍历指定物品
            for (int i = 0; i < value.length; i++) {
                // 当背包不放入物品或承重为0时，其最大价值均为0
                if (i == 0 || j == 0) {
                    v[i][j] = 0;
                } else {
                    // 如果第 i个物品重量大于总承重，则最优解存在于前 i-1 个背包中
                    if (j < weight[i - 1]) {
                        v[i][j] = v[i - 1][j];
                    } else {
                        // 如果第 i个物品不大于总承重，则最优解要么是包含第 i个背包的最优解，
                        // 要么是不包含第 i个背包的最优解， 取两者最大值

                        v[i][j] = Math.max(v[i - 1][j], value[i]
                                + v[i - 1][j - weight[i-1]]);
                    }

                }
                maxValue = v[i][j];
            }



        }
        return maxValue;
    }
    public static void main(String[] args) {
       int[] weight = {1, 3, 5, 7, 1};
       int[] value = {2, 4, 3, 6, 3};
    //    int[] weight = {7,3,4,5};
    //    int[] value = {42,12,40,25};
        int capacity = 1; //容量
        System.out.println(maxValue(weight, value, capacity));
    }


}