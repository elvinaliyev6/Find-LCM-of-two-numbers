package main;

import java.util.Scanner;
import util.FindLcm;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int result = FindLcm.findLcm(a, b);
        System.out.println(result);
    }

}
