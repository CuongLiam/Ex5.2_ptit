import java.util.ArrayList;

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
