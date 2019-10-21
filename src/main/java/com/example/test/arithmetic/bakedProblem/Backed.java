package com.example.test.arithmetic.bakedProblem;

public class Backed {



    public static void main(String[] args) {
        int[] backe={10,9,7,6,5,12,15};

        for(int i=0;i<backe.length;i++)
        {   int max =backe[0];
            int max_ponit=0;
            for(int j=0;j<backe.length-i;j++) {

                if (backe[j] < backe[j + 1]) {
                   max=backe[j+1];
                   max_ponit=j+1;
                }
            }
            if (max_ponit!=backe.length-1-i)
            {
                for(i=0;i<max_ponit/2;i++)
                {
                    int temp=backe[max_ponit];
                    backe[max_ponit]=backe[0];
                    backe[0]=temp;
                }
            }
        }
    }
}
