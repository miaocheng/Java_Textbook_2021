
import java.io.*;

public class TestRandomAccessFile   {
    public static void main(String [] args) throws IOException {
        RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
        inout.setLength(0);
        for (int i = 0; i < 200; i++)
            inout.writeInt(i);

        System.out.println("文件当前长度是: " + inout.length());
        inout.seek(0);
        System.out.println("第1个数是: " + inout.readInt());
        inout.seek(1 * 4);
        System.out.println("第2个数是: " + inout.readInt());

        inout.seek(9 * 4);
        System.out.println("第10个数是: " + inout.readInt());
        inout.writeInt(555);
        inout.seek(inout.length());
        inout.writeInt(999);
        System.out.println("新文件的长度是: " + inout.length());
        inout.seek(10 * 4);
        System.out.println("第11个数是: " + inout.readInt());
        inout.close();
    }

}


