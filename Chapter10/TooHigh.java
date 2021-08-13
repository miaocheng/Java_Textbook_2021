

public class TooHigh extends Exception  {
    int score;
    public TooHigh(String mess, int score)  {
        super(mess);
        this.score = score;
    }
}

