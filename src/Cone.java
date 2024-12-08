
// A class that extends the Shape class and represents a cone shape
public class Cone extends Shape {
	// Private properties
	private double radius;
	private double height;
	
	// Default Constructor
	public Cone() {
		this.radius = -1.0;
		this.height = -1.0;
	}
	
	// Parameterized Constructor
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// A method that returns the radius value
	public double getRadius() {
		return this.radius;
	}
	
	// A method that returns the height value
	public double getHeight() {
		return this.height;
	}
	
	// A method to set the radius and outputs a error string if the radius is not valid
	public void setRadius(double radius) {
		if (!isValidValue(radius, "radius")) {
			return;
		}
		this.radius = radius;
	}
	
	// A method to set the height and outputs a error string if the height is not valid
	public void setHeight(double height) {
		if (!isValidValue(height, "height")) {
			return;
		}
		
		this.height = height;
	}
	
	// Overridden toString method that returns the shapes full output of volume and surface area
	@Override
	public String toString() {
		return String.format("Shape: Cone\nSurface Area: %.2f\nVolume: %.2f\n", surfaceArea(), volume());
	}

	// Required abstract surface area method that returns the surface area value if radius and height is valid
	@Override
	double surfaceArea() {
		if (!isValidValue(radius, "radius")) {
			return 0.0;
		}
		
		if (!isValidValue(height, "height")) {
			return 0.0;
		}
		
		return  Math.PI * radius * (radius + Math.sqrt( Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
	}

	// Required abstract volume method that returns the volume value if radius and height is valid
	@Override
	double volume() {
		if (!isValidValue(radius, "radius")) {
			return 0.0;
		}
		
		if (!isValidValue(height, "height")) {
			return 0.0;
		}
		
		return Math.PI * Math.pow(radius, 2.0) * (height / 3.0);
	}
}
