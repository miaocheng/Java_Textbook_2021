

public class TooLow extends Exception   {
    int score;
    public TooLow(String mess, int score)   {
        super(mess);
        this.score = score;
    }

}

