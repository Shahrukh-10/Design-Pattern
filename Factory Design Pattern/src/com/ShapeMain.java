package com;

import com.shape.ShapeFactory;
import com.shape.shape;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape do u want ? \n");

        String str = sc.nextLine();
        ShapeFactory obj = new ShapeFactory();

        shape sp = obj.getInstance(str);
        sp.details();
    }
}
