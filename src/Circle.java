class Circle extends GeometricObject{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getDiameter(){
        return 2*radius;
    }

    @Override
    double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return super.toString()+"Circle: "+getRadius() + " " + getArea() + " " + getPerimeter();
    }
}