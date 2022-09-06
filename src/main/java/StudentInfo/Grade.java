package StudentInfo;
import java.util.Random;
public class Grade {
    public static void main(String[] args) {
        int grade = 74;
        if (grade >= 90) {
            System.out.println("You got an A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("you got a B");
        } else if(grade >= 70 && grade < 80){
            System.out.println("you got a C");
        }else if (grade > 60 && grade< 70){
            System.out.println("you got an F");
        }
        else {
            System.out.println("you failed the class");
        }

Random studentgrade = new Random();
        int numer ;
        for(int counter =1; counter<=10;counter++){
            grade = studentgrade.nextInt(100);
            System.out.println(grade + " ");
        }
    }
}
