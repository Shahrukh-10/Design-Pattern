package com.ingenuity;

import java.util.Arrays;

public class Question
{
    public static void ans(int[] arr){
        int[] a = new int[arr.length];
        Arrays.sort(arr);
        int k=0;
        int j=0;
        for(int i = 0 ;i<arr.length;i++){
        if(arr[i]<0){
            k = 2*j + 1;
            j++;
            a[k]=arr[i];
        }
        }
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>0  && a[i]==0){
                a[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
    static boolean[] arr = new boolean[100000000+1];
//    O(n log(logn))
//    false => prime , true = nonprime
    public static void siev(){
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i*i<=arr.length ; i++) {
            for(int j = i*i;j<arr.length;j+=i){
                if(arr[j]==false){
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==false){
                System.out.println(i);
            }
        }
    }
//    O(n*sqrt(n))
    public static void prime(int s,int e){
        for(int i=s;i<e;i++){
            int count = 0;
            for(int j = 2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        siev();
//        prime(2,1000000000);
//        ans(arr);
    }
}
