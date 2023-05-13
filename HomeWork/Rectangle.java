package javaCC.HomeWork;

 class Rectangle {
    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        return height * width;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }
    
}

class RectangleMain {
    public static void main(String[] args) {
        var rectangle1 = new Rectangle(15, 10);

        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        rectangle1.setHeight(19);
        rectangle1.setWidth(17);

        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
