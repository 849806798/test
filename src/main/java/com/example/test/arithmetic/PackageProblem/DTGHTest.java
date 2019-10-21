package com.example.test.arithmetic.PackageProblem;

public class DTGHTest {

    public static void main(String[] args) {
        Knapsack[] bags = new Knapsack[]{new Knapsack(2, 13),
                new Knapsack(1, 10), new Knapsack(3, 24), new Knapsack(2, 15),
                new Knapsack(4, 28), new Knapsack(5, 33), new Knapsack(3, 20),
                new Knapsack(1, 8)};
        Knapsack[] bagss=new Knapsack[]{new Knapsack(1, 2),
                new Knapsack(3, 4), new Knapsack(5, 3), new Knapsack(7, 6),
                new Knapsack(1, 3)
        };
        int[] weight = {1, 3, 5, 7, 1};
        int[] value = {2, 4, 3, 6, 3};
        int totalWeight = 0;
        DTGHProblem problem = new DTGHProblem(bagss, totalWeight);

        problem.solve();
        for (int[] i: problem.getBestValues()) {
            for (int j=0;j<i.length;j++)
            {
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
        System.out.println(problem.getBestValue());
    }

}