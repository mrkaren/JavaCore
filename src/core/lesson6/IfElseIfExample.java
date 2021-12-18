package core.lesson6;

public class IfElseIfExample {

    public static void main(String[] args) {
        String country = "Armenia";
        String language = "";

        switch (country) {
            case "Armenia":
                language = "hy";
                break;
            case "Russia":
                language = "ru";
                break;
            case "USA":
                language = "en";
                break;
            default:
                language = "es";
        }


        System.out.println("language = " + language);


    }
}
