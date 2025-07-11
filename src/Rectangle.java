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