package core.lesson14;

public class Demo {

    public static void main(String[] args) {
        Object a = new Integer(5);

        if(a instanceof String){
            String str = (String) a;

            System.out.println(str.toUpperCase());
        }

    }

}
