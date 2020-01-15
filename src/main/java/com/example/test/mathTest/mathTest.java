package com.example.test.mathTest;

/**
 * @author: fgw
 * @Created: 2020/1/3 13:23
 */
public class mathTest {

    public static void main(String[] args) {
        int[] num=new int[100000];
        for (int i = 2;i<100000;i++){
            for(int j=0;j<100;j++){
                int k = i;
                int sum=0;
                int sum1=0;
                while (k!=0){
                   sum+= k%10;
                   k=k/10;
                }
                int l= i*j;
                while (l!=0){
                    sum1+= l%10;
                    l=l/10;
                }
                if(sum==sum1){
                  num[i]+= 1;
                }
            }
            if(num[i]>3){
                System.out.printf("num["+i+"] = "+num[i]+"\n");
            }

        }
    }
}
