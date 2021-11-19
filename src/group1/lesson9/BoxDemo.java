package group1.lesson9;

public class BoxDemo {

    public static void main(String[] args) {


        Box myBox1 = new Box(23,45,67);

        Box box = new Box(myBox1);

        System.out.println(myBox1.width);
        System.out.println(box.width);

//        myBox.width = 10;
//        myBox.height = 20;
//        myBox.depth = 15;
//
//        double volume = myBox.volume();
//        System.out.println(volume * 2 );
//
//        myBox1.width = 100;
//        myBox1.height = 200;
//        myBox1.depth = 10;
//        myBox1.volume();
    }

}
