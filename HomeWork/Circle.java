package javaCC.HomeWork;

 class Circle {
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    public float getRadius(){
        return radius;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getCircumference() {
        return (float) (Math.PI * radius);
    }
    
}

class CircleMain {
    public static void main(String[] args) {
        var c = new Circle(33);

        System.out.println("radius: " + c.getRadius());
        System.out.println("area: " + c.getArea());
        System.out.println("Circumference:" + c.getCircumference());
    }
} 
