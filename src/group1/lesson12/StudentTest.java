package group1.lesson12;

public class StudentTest {

    public static void main(String[] args) {
        Student poxos = new Student("Poxos",
                "Poxosyan", "094555555",
                23, "Java");

        System.out.println(poxos.getName());
        poxos.setName("poxosik");
        System.out.println(poxos.getName());


    }
}
