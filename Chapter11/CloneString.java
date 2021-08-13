
class CloneString   {
    public static void main(String args []) {
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str1 = new String(c);
        String str2 = new String(str1);
        System.out.println(str1);
        System.out.println(str2);
    }

}


