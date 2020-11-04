public class SuperArray {

    // Instance Variables
    private String [] data;
    private int size; //The current size
    private int capacity;

    //constructor
    public SuperArray(int initialCapacity){
    size = 0;
    data = new String [10];
    initialCapacity = capacity;
    }

    // returns the number of elements in this list
    public int size() {
 
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

	public boolean add(String element) {
		if (size == data.length)
			{resize(); }

		{data[size] = element;
		size++;
    return true;
	} }

public boolean isEmpty()
{if (size == 0)
return true;
return false;}

public void clear()
{size = 0;}
}


public String toString() {
 String result = "["
 {for (int i = 0; i < size; i++)
     result = += data[i];
     if (size > 1 && i < size -1){
     result += ", ";
     }
     result += "]"
     return result;
 
}}

public boolean contains(String s)
String element0 = s;
for (int i=0; i < data.length -1; i++) {
if (data[i] == s) {
return true;
}
return false;
}

public String remove(int index){
for (int i = index; i < size-1; i++)
{ data[i] = data[i + 1];
size--;}
return data[index];
}

public void add(int index, String element){
if (index >= size)  {
add (element);
if (size == data.length)
resize();
for (int i = size; i>index; i--)
data[index] = element;
data[i] = data[i-1];

}
}
