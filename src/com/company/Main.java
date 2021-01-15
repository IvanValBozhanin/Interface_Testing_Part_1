package com.company;

public class Main {

    public static void main(String[] args) {
        Square [] sq = new Square[5];
        for(int i=0;i<5;++i){
            sq[i] = new Square(i+1);
            System.out.println(sq[i].getArea());
            if(sq[i] instanceof Colorable)
                sq[i].howToColor();
        }
    }
}