public class SuperArray {

    // Instance Variables
    public String [] data;
    public int size; //The current size
    public int capacity;

    //constructor
    public SuperArray(int initialCapacity){
    
    if (initialCapacity < 0) {
    throw new IllegalArgumentException("capacity " + initialCapacity
        + " cannot be negative");
}
    capacity = initialCapacity;
    data = new String [capacity];
    size = 0;
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
       
      throw new IndexOutOfBoundsException("index " + index
          + "is out of bounds");
  }
  		
  			return data[index];}
  	

    // Replaces the element at the specified position in this list 
    // with the specified element. 
    // Return the value you replaced. 
    
    public String set(int index, String element) {
    if (index >= size || index < 0) {
     
    throw new IndexOutOfBoundsException("index " + index
        + "is out of bounds");
}  
  			String original = data[index];
  			data[index] = element;
  			return original;
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
if (index >= size || index < 0) {
 
throw new IndexOutOfBoundsException("index " + index
    + "is out of bounds");
} 
if (data[index] == null) {
return null;
}
String result = data[index];
	{
for (int i = index; i < size-1; i++)
{ data[i] = data[i+1 ];}
 
	size--;
return result;}}

public void add(int index, String element){
if (index >= size || index < 0) {
throw new IndexOutOfBoundsException("index " + index
    + "is out of bounds");
} 

if (size == data.length)
{resize();}

for (int i = size - 1; i>=index; i--)
{
     data[i+1] = data[i];
}
        data[index] = element;
	size ++;
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

public boolean equals(SuperArray other){ 
int length1 = size;
int length2 = other.size();
if (length1 != length2)
return false;

for (int i = 0; i < length1; i++)
           if (!data[i].equals(other.get(i)))
               return false;
               return true;
}

public int lastIndexOf(String value){ 
for (int i = size-1; i >= 0; i--)
{if (data[i].equals(value))
return i;}
return -1;}
	





}
