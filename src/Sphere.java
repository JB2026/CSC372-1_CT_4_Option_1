
// A class that extends the Shape class and represents a sphere shape
public class Sphere extends Shape {
	// Private properties
	private double radius;
	
	// Default Constructor
	public Sphere() {
		this.radius = -1.0;
	}
	
	// Parameterized Constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	// A method to set the radius and outputs a error string if the radius is not valid
	public void setRadius(double radius) {
		if (!isValidValue(radius, "radius")) {
			return;
		}
		
		this.radius = radius;
	}
	
	// A method that returns the radius value
	public double getRadius() {
		return radius;
	}
	
	// Overridden toString method that returns the shapes full output of volume and surface area
	@Override
	public String toString() {
		return String.format("Shape: Sphere\nSurface Area: %.2f\nVolume: %.2f\n", surfaceArea(), volume());
	}
	
	// Required abstract surface area method that returns the surface area value if radius is valid
	@Override
	double surfaceArea() {
		if (!isValidValue(radius, "radius")) {
			return 0.0;
		}
		
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	// Required abstract volume method that returns the volume value if radius is valid
	@Override
	double volume() {
		if (!isValidValue(radius, "radius")) {
			return 0.0;
		}
		
		return Math.PI * Math.pow(radius, 3.0) * (4.0/3.0);
	}
}
