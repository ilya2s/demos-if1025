package ca.umontreal.iro.demo2.corrige.sansHeritage;

public class Rectangle {
    // Attributes
    private int width;
    private int height;


    // Constructors
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(5, 5);
    }


    // Getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    // Setters
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    // Other methods
    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle de largeur " + width + " et de hauteur " + height;
    }
}
