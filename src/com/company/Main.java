package com.company;
/*Программа ищет максимум и минимум в массиве*/
public class Main{

    public static void main(String[] args) {
	// write your code here

        int array[] = {10, 20, 30, 100, 1, 555, 0, 15000, 2, 5, 36, -1};
        int max = 0;
        int min = 0;

        for(int i = 0; i < array.length; i++){
            if(max <= array[i]){
                max = array[i];
            }
            if(min >= array[i])
               min = array[i];
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }
}
