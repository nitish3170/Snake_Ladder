import java.util.Random;
import java.util.Vector;

public class Main {
    static Random random = new Random();
    private static int RollDice(){
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
    private static void UC2_RollDice(){
        int dice=RollDice();
        System.out.printf("Dice Roll: %d \n",dice);
    }
    private static int CheckOption(){
        int check=random.nextInt(3)+1;
        return check;
    }
    private static void UC3_CheckOptions(){
        int i=CheckOption();
        if (i==1) System.out.println("Case: No Play");
        else if (i==2) System.out.println("Case: Ladder");
        else System.out.println("Case: Snake");
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");
        UC2_RollDice();
        UC3_CheckOptions();
    }
}