package dynamicarray;

public class Runner {
	private static DynamicArray ar;
	
	public static void main(String[] args) {
		
		ar = new DynamicArray();
		
		ar.add(5);
		ar.add(6);
		ar.add(8);
		ar.add(9);
		ar.add(12);
		ar.add(23);
		System.out.println("Size " + ar.length());
		
		System.out.println("Get Item " + ar.getItem(2));
		
		
		
		

	}

}
