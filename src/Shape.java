
public abstract class Shape {
	private shapeType ShapeType;
	
	public shapeType getShapeType(){ return this.ShapeType ;} 
	public void setShapeType(shapeType shape){
		this.ShapeType = shape;
	}
	public abstract double getArea();
	public Shape(shapeType shape){
		setShapeType(shape);
	}
}
