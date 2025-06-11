import java.util.Date;

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