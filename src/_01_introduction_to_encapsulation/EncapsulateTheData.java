package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public void setItemsReceived(int x) { if(x<0) x=0; itemsReceived=x;}
	public int getItemsReceived() { return itemsReceived;}
	
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	public void setDegreesTurned(double x) {if(x>=0&&x<=360) degreesTurned=(float) x; }
	public float getDegreesTurned() { return degreesTurned;}
	
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	public void setNomenclature(String s) {if(s.equals("")) s = " "; nomenclature=s;}
	public String getNomenclature() { return nomenclature;}
	
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	public void setMemberObj(Object o) {
		
		if ( o instanceof String) o = new Object();
		memberObj = o;
		
	} 
	public Object getMemberObj() { return memberObj;}
	
	public static void main(String[] args) {
		EncapsulateTheData e = new EncapsulateTheData();
		e.setItemsReceived(5);
		System.out.println(e.getItemsReceived());
		e.setItemsReceived(-2);
		System.out.println(e.getItemsReceived());
	}
}
