
public abstract class TwoDimentionalShapeFactory extends Shape {

	public Shape TwoDimentionalShapeFactory(String shapeType, String name){
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle(name);
		} else if (shapeType.equalsIgnoreCase("square")){
			return new Square(name);
		}
		return null;
	}
}
