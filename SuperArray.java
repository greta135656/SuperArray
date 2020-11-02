public class SuperArray {

    // Instance Variables
    private String [] data;
    private int size; //The current size

    //constructor
    public SuperArray(){
    data = new String[0];
    }

    // method 1
    public int size() {
    int size = 0;
    for (int i = 0; i < data.length; i++){
    size++;}
    return size;
    }
    
    // Appends the specified element to the end of this list. 
    public void add(String element){
    data = data + element;
    }

    // Returns the element at the specified position in this list.
    public String get(int index){
    return data.charAt(index);
    }

    // Replaces the element at the specified position in this list 
    // with the specified element. 
    // Return the value you replaced. 
    
    public String set(int index, String element)
    { data = data.substring(0, index) + element + data.substring(index+1, data.string());
      return data; }

    // resize
    private void resize(){
  String[] data2 = new String[data.length + 1];
  for(int i = 0; i < data.length; i++){
    data2[i] = data[i];
  }
  data = data2;
}}
