import java.util.ArrayList;

// Class to that creates shapes and outputs their information
public class ShapeArray {

	public static void main(String[] args) {
		// Create the shape array
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		// Create the shapes
		Sphere sphere = new Sphere(14.0);
		Cylinder cylinder = new Cylinder(11.0, 16.0);
		Cone cone = new Cone(12.0, 15.0);

		// Add the shapes to the shapeArray
		shapes.add(sphere);
		shapes.add(cylinder);
		shapes.add(cone);

		// Loop through and get the toString output of each shape
		for (Shape shape: shapes) {
			System.out.println(shape.toString());
		}
	}
}
