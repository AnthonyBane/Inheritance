
public abstract class ThreeDimentionalShapeFactory extends Shape {
	public Shape ThreeDimentionalShapeFactory (String shapeType, String name){
		if(shapeType.equalsIgnoreCase("cube")){
			return new Cube(name);
		}
		return null;
	}
}
