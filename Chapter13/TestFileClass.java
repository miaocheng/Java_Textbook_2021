
import java.io.File;
import java.util.Date;

public class TestFileClass  {
    public static void main(String [] args) {
        File file = new File("./boma.jpg");
        System.out.println("文件存在么？" + file.exists());
        System.out.println("文件有 " + file.length() + " 字节");
        System.out.println("文件能读么? " + file.canRead());
        System.out.println("文件能读么? " + file.canWrite());
        System.out.println("它是目录么? " + file.isDirectory());
        System.out.println("它是文件么? " + file.isFile());
        System.out.println("是绝对路径文件? " + file.isAbsolute());
        System.out.println("文件被隐藏了? " + file.isHidden());
        System.out.println("文件绝对路径是 " + file.getAbsolutePath());
        System.out.println("最后一次修改的日期与时间 " + new Date(file.lastModified()));

    }

}


