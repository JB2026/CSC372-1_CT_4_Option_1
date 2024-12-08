
// Class to that creates shapes and outputs their information
public class ShapeArray {

	public static void main(String[] args) {
		// Create the shape array
		Shape[] shapeArray = new Shape[3];
		
		// Create the shapes
		Sphere sphere = new Sphere(14.0);
		Cylinder cylinder = new Cylinder(11.0, 16.0);
		Cone cone = new Cone(12.0, 15.0);
		
		// Add the shapes to the shapeArray
		shapeArray[0] = sphere;
		shapeArray[1] = cylinder;
		shapeArray[2] = cone;

		// Loop through and get the toString output of each shape
		for (int i = 0; i < shapeArray.length; i++) {
			Shape currentShape = shapeArray[i];
			System.out.println(currentShape.toString());
		}
	}
}
