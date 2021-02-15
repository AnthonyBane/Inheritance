
public class Cube extends Shape{

	protected double sideLength;
	
	public double getSideLength(){
		return sideLength;
	}
	
	private void setSideLength(double length){
		sideLength = length;
	}
	
	@Override
	public double getArea() {
		return (getSideLength()*6);
	}
	
	public Cube(String name, double _sideLength){
		super(name);
		setSideLength(_sideLength);
	}
}
