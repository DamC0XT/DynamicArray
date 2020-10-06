package dynamicarray;

public class DynamicArray {
	
	private int items,capacity;
	private int[]array;
	
	public DynamicArray() {
		
		this.items = 0;
		this.capacity = 1;
		this.array = this.makeArray(capacity);
	}
	
	public int length() {
		
		return this.items;
	}
	
	public int getItem(int index) {
		
		if (index < 0 || index >= items)
			throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
				
				
		return this.array[index];
		
	}
	
	
	public void add(int element) {
		
	
        if(items == capacity)
        	
            this.resize(2*capacity);
        
        this.array[items] = element;
        items ++;
		
		
	}
	
	public void resize(int newCap) {
		
		int[] temp = this.makeArray(newCap);
		
		for(int k = 0; k < items; k ++) {
			temp[k] = array[k];
			
		}
		array = temp;
		capacity = newCap;
       
	}
	
	public int[] makeArray(int newCap) {
		int[] newArray = new int[newCap];
		
		return newArray;
	}
	
	

}
