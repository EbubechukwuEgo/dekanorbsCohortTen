package classesAndObjects;

public class Cylinders {
    private int radius;
    private int height;

    public int getVolume(int radius, int height){

        if (radius < 0 || height < 0){
            throw new IllegalArgumentException("radius and height are supposed to be positive integers.");
        }

        double volume = Math.PI * Math.pow(radius, 2) * height;

        return (int) volume;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
