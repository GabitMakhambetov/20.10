package com.company;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int n = in.nextInt();
        int [] arr = new int [n];
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n - 1; i++){
            for (int j = i; j < n; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
