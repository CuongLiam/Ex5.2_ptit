import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricObject> shapes = new ArrayList<>();

        shapes.add(new Circle(3, "blue", true));
        shapes.add(new Rectangle(2,3, "red", false));

        for (int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i));
        }

//        GeometricObject geo = new GeometricObject(); //'GeometricObject' is abstract; cannot be instantiated


    }
}

abstract class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();

    protected GeometricObject(){

    }
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

//    @Override
//    public String toString(){
//        return "GeoOBj: "+color+ " " + (filled ? "yes " : "no ");
//    }

    @Override
    public String toString() {
        return String.format( // very good String.format
                "%s[created=%s, color=%s, filled=%b]",
                this.getClass().getSimpleName(),
                dateCreated,
                color,
                filled
        );
    }

    abstract double getArea(); // abstract method thi biet r ha (check oop_prac)
    abstract double getPerimeter();
}

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

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double getPerimeter() {
        return (width + height)*2;
    }

    @Override
    public String toString(){
        return super.toString()+"Rectangle: "+getWidth()  + " " +getHeight()+ " " + getArea() + " " + getPerimeter();
    }
}