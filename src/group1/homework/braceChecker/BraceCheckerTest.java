package group1.homework.braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "h(e)llo (from) jav[a";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
