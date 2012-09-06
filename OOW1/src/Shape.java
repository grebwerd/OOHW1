public abstract class Shape {

	private String shapeType;

	protected String getShape() {
		return shapeType;
	}

	protected void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	
	protected String display() {
		String display = " shape is a " + getShape();
		return display;
	}
}
