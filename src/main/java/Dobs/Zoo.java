package Dobs;

public class Zoo {
    public static void main(String[] args) {
        //data type
        Animal animal1 = new Animal("jackie",2,"quak");
        Animal animal2 = new Animal("mikey", 4, "woof woof");
        animal1.makeNoise();//string name
        System.out.println(animal1.makeNoise());
        System.out.println(animal2.getNumberEyes());
    }
}
