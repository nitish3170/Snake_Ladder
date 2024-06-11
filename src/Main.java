import java.util.Random;

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
    private static int CheckPos(int start){
        int pos=start;
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
    private static int CalculateValue(int start){
        int option=CheckOption();

        if (option==2){
            start=CheckPos(start);
            start=CheckPos(start);
        }
        start=CheckPos(start);
        return start;
    }
    private static void UC6_DiceRollFreqAndPos(){
        int winPoints=100;
        int start=0,c=0;
        while (start!=winPoints){
            start=CalculateValue(start);
            System.out.printf("Position: %d\n",start);
            c++;
        }
        System.out.printf("Dice Roles : %d\n",c);
    }
    private static int PlayGame(){
        int winPoints=100;
        int start=0,c=0;
        while (start!=winPoints){
            start=CalculateValue(start);
            c++;
        }
        return c;
    }
    private static void UC7_PlayGame(){
        int player1=PlayGame();
        int player2=PlayGame();
        if (player1>player2) System.out.println("Player 2 Won the game");
        else if(player1<player2) System.out.println("Player 1 won the game");
        else System.out.println("Its a tie");
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");
        UC2_RollDice();
        UC3_CheckOptions();
        System.out.println("Game Play: ");
        UC6_DiceRollFreqAndPos();
        UC7_PlayGame();
    }
}