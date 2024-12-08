
// An abstract class that represents a shape
public abstract class Shape {
	
	// A method that returns the surface area of the shape as a double
	abstract double surfaceArea();
	
	// A method that returns the volume of the shape as a double
	abstract double volume();
	
	// A method that checks the passed in value to be above zero or outputs an error message with the passed in valueChecked name
	boolean isValidValue(double value, String valueChecked) {
		if (value <= 0) {
			System.out.printf("Invalid %s set. Please set a value larger than 0.\n\n", valueChecked);
			return false;
		}
		
		return true;
	}
}
