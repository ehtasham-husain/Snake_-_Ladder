// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class SnakeLadderSimulator {
    public static final int No_Play = 0;
    public static final int Snake = 1;
    public static final int Ladder = 2;
    public static void main(String[] args) {
        int Player_Position = 0;
        int RollsDiceCount = 0;
        while (Player_Position < 100) {
            int RollsDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            RollsDiceCount++;
            System.out.println("Rolls Dice::"+RollsDice);
            
            switch (Player_Position) {
                case 15:
                    System.out.println("SNAKE::");
                    Player_Position -= 5;
                    break;
                case 28:
                    System.out.println("SNAKE::");
                    Player_Position -= 10;
                    break;
                    case 35:
                    System.out.println("SNAKE::");
                    Player_Position -= 10;
                    break;
                case 55:
                    System.out.println("LADDER::");
                    Player_Position += 35;
                    break;
                    case 70:
                    System.out.println("LADDER::");
                    Player_Position += 17;
                    break;
                default:
                    Player_Position += RollsDice;
            }
            if (Player_Position < 0)
                Player_Position = 0;
            else if (Player_Position > 100)
                Player_Position -= RollsDice;
            System.out.println("Player Position : " +Player_Position );
        }
        System.out.println("Total Rolls Dice Counting=="+RollsDiceCount);
    }
}
