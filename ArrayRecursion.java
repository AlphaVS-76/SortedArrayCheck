package com.company;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5};
        boolean isSort = arrayrec(arr, 0);
        System.out.println(isSort);
    }

    static boolean arrayrec(int[] arr, int i) {
        if(i < arr.length-1)
            return arr[i] < arr[i + 1] && arrayrec(arr, i+1);
        return true;
    }
}