package com.shape;


public class ShapeFactory {
    public shape getInstance(String str){
        if(str.equals("rectangle")){
            return new Rectangle();
        }else if(str.equals("circle")){
            return new Circle();
        }else {
            return new Square();
        }
    }
}
