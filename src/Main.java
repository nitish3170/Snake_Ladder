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
        System.out.println("UC2 result: ");
        System.out.printf("Dice Roll: %d \n",dice);
    }
    private static int CheckOption(){
        int check=random.nextInt(3)+1;
        return check;
    }
    private static void UC3_CheckOptions(){
        int i=CheckOption();
        System.out.println("UC3 result: ");
        if (i==1) System.out.println("Case: No Play");
        else if (i==2) System.out.println("Case: Ladder");
        else System.out.println("Case: Snake");
    }
    private static int CalculateValue(int start){
        int i=RollDice();
        int option=CheckOption();
        switch (option){
            case 1:
                return start;
            case 2:
                if (start+i<=100) return start+i;
                else return start;
            case 3:
                if (start-i<0) return 0;
                else return start-i;
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");
        UC2_RollDice();
        UC3_CheckOptions();
        System.out.println("Game Play: ");
        int start=0;
        while (start!=100){
            start=CalculateValue(start);
        }
        System.out.println("Player Won the game");
    }
}