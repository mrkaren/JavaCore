package group2.lesson9;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        double vol = width * height * depth;
        return vol;
    }



}
