
public class ArrayList<T> {
	
	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T[] arList;
  
	public ArrayList() {
		this.arList = (T[])new Object[10];
	}//end empty-argument constructor
  
	public ArrayList(int length) {
		this.arList = (T[])new Object[length];
	}//end preferred constructor
	
	public boolean addItem (T item) {
		
		if (currentItem<arList.length) {
			arList[currentItem]=item;
			System.out.println("Item added.");
			currentItem++;
			return true;
			}
		else {
			System.out.println("Item not added, index bounds exceeded.");
			return false;
		}
		
	}//end addItem

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Contents of array:\n");
		
		for(T i : arList) {
			sb.append(i.toString()+"\n");
		}
		return sb.toString();
	}//end toString
	
}//end class