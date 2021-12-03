package com;

import com.phone.OS;
import com.phone.OperatingSystemFactory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory ops = new OperatingSystemFactory();
        System.out.println("Which os do u want ? ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        OS obj = ops.getInstance("open");
        obj.show();
    }
}
