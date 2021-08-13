
public class GetCharsDemo   {
    public static void main(String [] args) {
        String s = "hello world";
        int start = 6, end = 11;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }

}


