import java.util.Random;
import java.util.Vector;

public class Main {
    private static int RollDice(){
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
    private static void UC2_RollDice(){
        int dice=RollDice();
        System.out.printf("Dice Roll: %d",dice);
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");
        UC2_RollDice();
    }
}