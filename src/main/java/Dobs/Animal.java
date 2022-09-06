package Dobs;

public class Animal {
public String animalName;
public int numberEyes;
public String animalSound;

//constructors
    public Animal(String animalName, int numberEyes, String animalSound){
       this.animalName=animalName;
       this.numberEyes=numberEyes;
       this.animalSound=animalSound;
    }
    //overloaded constructor
    public Animal(String animalName){
        this.animalName = animalName;
    }
    //method
    //always need access modifier(public)/ return data type(void)/ name(makeNoise)/ ()/ {}
    public String makeNoise(){
        return this.animalName + "=======>" + animalSound;

    }
    //return
    public float sleeping(){
        return 66.0f;
    }
    public int getNumberEyes(){
        return this.numberEyes;
    }
}
