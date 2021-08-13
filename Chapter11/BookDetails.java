
public class BookDetails    {
    final String name = "《数据库原理及技术》";
    final String author = "钱雪忠等";
    final String publisher = "清华大学出版社";

    public static void main(String args []) {
        BookDetails oneBookDetail = new BookDetails();
        System.out.println("The book detail: " + oneBookDetail.name +
                " - " + oneBookDetail.author + " - " + oneBookDetail.publisher);
    }

}


