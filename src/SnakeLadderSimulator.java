public class SnakeLadderSimulator {
    public static final int No_Play = 0;
    public static final int Snake = 1;
    public static final int Ladder = 2;
    public static void main(String[] args) {
        int Player_Position = 0;
        int RollsDice = (int)Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(RollsDice);
        int Options = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(Options);
        switch (Options) {
            case No_Play:
                System.out.println("Player No Play");
            case Snake:
                Player_Position += RollsDice;
                break;
            case Ladder:
                Player_Position -= RollsDice;
                break;
            default:
                System.out.println("Some error occured");
        }
    }
}
