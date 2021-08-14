public class SnakeLadderSimulator {
    public static final int No_Play = 0;
    public static final int Snake = 1;
    public static final int Ladder = 2;
    public static void main(String[] args) {
        int Player_Position = 0;
        while (Player_Position < 100) {
            int RollsDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println(RollsDice);
            int Options = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(Options);
            switch (Options) {
                case No_Play:
                    System.out.println("Player No Play::🚫🚫");
                    break;
                case Snake:
                    System.out.println("SNAKE::🐍🐍");
                    Player_Position -= RollsDice;
                    break;
                case Ladder:
                    System.out.println("LADDER::🔗🔗");
                    Player_Position += RollsDice;
                    break;
                default:
                    System.out.println("Some error occured");
            }
            if (Player_Position < 0)
                Player_Position = 0;
            else if (Player_Position > 100)
                Player_Position -= RollsDice;
            System.out.println("Player Position : " +Player_Position );
        }
    }
}
