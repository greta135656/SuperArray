public class SuperArray {

    // Instance Variables
    private String [] data;
    private int size; //The current size

    //constructor
    public SuperArray(){
    size = 0;
    data = new String [10];
    }

    // returns the number of elements in this list
    public int size() {
    for (int i = 0; i < data.length; i++)
    {
    size++;}
    return size;
    }
    


    // Returns the element at the specified position in this list.
    public String get(int index) {
  		if (index >= size || index < 0) {
  			return null;
  		} else {
  			return data[index];}
  	}

    // Replaces the element at the specified position in this list 
    // with the specified element. 
    // Return the value you replaced. 
    
    public String set(int index, String element) {
  		if (index >= size || index < 0) {
  			return null;
  		} else {
  			String original = data[index];
  			data[index] = element;
  			return original;
  		}
  	}
  	
  	
  	    // resize
    private void resize(){
  String[] data2 = new String[data.length + 1];
  for(int i = 0; i < data.length; i++){
    data2[i] = data[i];
  }
  data = data2;
}

//
	public boolean add(String element) {
		if (size == data.length)
			{resize();
      return false;}

		{data[size] = element;
		size++;
    return true;
	} }}
