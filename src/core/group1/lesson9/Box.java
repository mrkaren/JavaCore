package core.group1.lesson9;

public class Box {

    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(Box b) {
        width = b.width;
        depth = b.depth;
        height = b.height;
    }


    double volume() {
        return width * height
                * depth;
    }

}
