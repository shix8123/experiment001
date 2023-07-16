package com.example;

public class BubbleSortTest {
    public static void main(String[] args){
        int[] a={8,3,4,22,1};
        sort(a);
    }
    private static void sort(int[] a){
        int m,i,j;
        for(i = 0;i<a.length-1;i++){
            for(j = i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    m = a[j];
                    a[j] = a[i];
                    a[i] = m;
                }
            }
        }
        for(i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
