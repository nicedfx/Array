package com.company;
import java.util.Random;
/**
 * Created by sbacho on 14.06.2017.
 */
public class Ar {
    int[] arr = new int[10];
    Random rnd = new Random();
    void rand() {
        for(int i = 0; i < 10; i++){
            arr[i] = rnd.nextInt(100);
        }
        for(int i = 0; i < 10; i++) {
            System.out.println("The " + i + "st element is " + arr[i]);
        }
    }
    void minimum() {
        int min = arr[0];

        for(int i=1; i < arr.length; i++) {

        if(min > arr[i]) {
            min = arr[i];
        }
    }
        System.out.println("The minimal element is " + min);
    }

    void maximum(){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximal element is " + max);
    }
}
