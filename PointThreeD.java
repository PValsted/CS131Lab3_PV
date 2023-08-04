
public class PointThreeD {

	double xPoint, yPoint, zPoint;

	public PointThreeD() {
		xPoint=0;
		yPoint=0;
		zPoint=0;
	}//end empty-argument constructor
	
	public PointThreeD (double x, double y, double z) {
		xPoint=x;
		yPoint=y;
		zPoint=z;
	}//end preferred constructor;

	//begin getters and setters
	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	public double getzPoint() {
		return zPoint;
	}

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}
	//end getters and setters

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class
