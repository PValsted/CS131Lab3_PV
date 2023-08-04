
public class Square {

	double side;
	
	public Square() {
		side=1;
	}//end empty-argument constructor
	
	public Square(double side) {
		this.side=side;
	}//end preferred constructor
	
	public double getArea() {
		return side*side;
	}//end getArea

	public double getSide() {
		return side;
	}//end getSide

	public void setSide(double side) {
		this.side = side;
	}//end setSide

	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + this.getArea() + "]";
	}//end toString
	
}//end class
