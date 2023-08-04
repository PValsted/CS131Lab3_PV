
public class ListApp {

	public static void main(String[] args) {
		
		//testing ArrayList with Strings
		ArrayList<String> stringList= new ArrayList<String>(3);
		
		stringList.addItem("Banana");
		stringList.addItem("Pear");
		stringList.addItem("Strawberry");
		stringList.addItem("Tomato"); //Testing for bounds check
		
		System.out.println(stringList);
		
		//Testing ArrayList with Squares
		Square s1=new Square(3);
		Square s2=new Square(9);
		Square s3=new Square(6);
		
		ArrayList<Square> squareList=new ArrayList<Square>(3);
		
		squareList.addItem(s1);
		squareList.addItem(s2);
		squareList.addItem(s3);
		
		System.out.println(squareList);
		
		//Testing ArrayList with Points
		PointThreeD p1=new PointThreeD(3, 7, 10);
		PointThreeD p2=new PointThreeD(12, 67, 1);
		PointThreeD p3=new PointThreeD(53, 23, 643);
		PointThreeD p4=new PointThreeD(6, -5, 14);
		
		ArrayList<PointThreeD> pointList=new ArrayList<PointThreeD>(4);
		
		pointList.addItem(p1);
		pointList.addItem(p2);
		pointList.addItem(p3);
		pointList.addItem(p4);
		
		System.out.println(pointList);
		
	}//end main
	
}//end class
