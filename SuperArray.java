public class SuperArray {

    // Instance Variables
    public String [] data;
    public int size; //The current size
    public int capacity;

    //constructor
    public SuperArray(int initialCapacity){
    size = 0;
    capacity = initialCapacity;
    data = new String [capacity];
    }

    //constructor if capacity is not specified 
    public SuperArray(){
    size = 0;
    capacity = 10;
    data = new String [10];
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
  String[] data2 = new String[data.length * 2];
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



public String toString() {
 String result = "[";
 for (int i = 0; i < size; i++){
     result += data[i];
  {if (size > 1 && i < size -1){
     result += ", ";
     }}}
     result += "]";
     return result;
 
}




public String remove(int index){
for (int i = index; i < size; i++)
{ data[i] = data[i + 1];}
	size--;
return data[index];
}

public void add(int index, String element){
if (index >= size)  
add (element);
else
{if (size == data.length)
resize();
for (int i = size - 1; i>=index; i--)
{

     data[i+1] = data[i];
}
        data[index] = element;
	size ++;
}
}

public String[] toArray(){
String[] copy = new String[size];
for (int i = 0; i < size; i++){
copy[i] = data[i];
}
return copy;
}

public boolean contains(String s)
{if(size == 0)
    return false;

    for (int i=0; i < size(); i++)
    {
        if (data[i].equals(s)) 
        {
            return true;
        }
    }
            return false;
}

 public int indexOf(String s) {
 for (int i = 0; i < size; i++)
 {if (data[i].equals(s))
 return i;}
 return -1;}
	
}
