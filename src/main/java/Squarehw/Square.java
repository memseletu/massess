package Squarehw;

public class Square {
    public double sides;

    public Square(double sides){
        this.sides=sides;
    }
    public double calculateArea(){
        return Math.pow(this.sides, 2);
    }


}
