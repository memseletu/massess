package Squarehw;

import Squarehw.Square;

public class Squarefactory {
    public static void main(String[] args) {
        Square sq1 = new Square(4.5);
        System.out.println(sq1.calculateArea());

        //if statements
        boolean isRaining = true;
        if (isRaining){
            System.out.println("it is Raining");
        }
    }
}
