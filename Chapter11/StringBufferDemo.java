
public class StringBufferDemo   {
    public static void main(String args []) {
        StringBuffer buf = new StringBuffer();
        buf.append("World !");
        buf.insert(0, "Hello ");

        System.out.print(buf);
        String str = buf.reverse().toString();
        System.out.println("<->" + str);
    }

}

