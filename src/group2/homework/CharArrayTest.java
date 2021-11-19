package group2.homework;

public class CharArrayTest {
    public static void main(String[] args) {
        CharArray charArray = new CharArray();
        char[] text = {' ', ' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', 'S','c', 'r', 'i', 'p', 't', ' ',' ' ,' ',' ', ' '};

        char[] result = charArray.trim(text);

        for (char c : result) {
            System.out.print(c);
        }
    }

}
