package group1.lesson6;

public class SwitchExample {

    public static void main(String[] args) {
        String country = "";

        switch (country) {
            case "America":
            case "UK":
            case "US":
                System.out.println("Hello");
                break;
            case "ru":
                System.out.println("Привет");
                break;
            case "hy":
                System.out.println("Բարև");
                break;
            default:
                System.out.println("unknown language");
        }

//        if(language.equals("en")) {
//            System.out.println("Hello");
//        }
//        else if(language.equals("ru")) {
//            System.out.println("Привет");
//        }
//        else if(language.equals("hy")) {
//            System.out.println("Բարև");
//        } else {
//            System.out.println("unknown language");
//        }

    }

}
