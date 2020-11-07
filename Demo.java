public class Demo{

public static void removeDuplicates(SuperArray s){
for(int i = 0; i < s.size(); i++){
  if(s.indexOf(s.get(i)) < i){
    s.remove (i);
    i--;
  }
 }
}

public static SuperArray findOverlap(SuperArray a, SuperArray b)
{SuperArray newList = new SuperArray();
for (int i = 0; i < a.size(); i++){
for (int j = 0; j < b.size(); j ++){
if (a.get(i).equals(b.get(j))){
newList.add(a.get(i));
}
}
}
removeDuplicates(newList);
return newList;}

public static SuperArray zip(SuperArray a, SuperArray b){ 
SuperArray newArray = new SuperArray();
int c = 0;
int d = 0;
int e = 0;
while (c < a.size () && d < b.size())
{newArray.add(e, (a.get(c)));
newArray.add(e+1, (b.get(d)));
c ++;
d ++;
e += 2;
 }

 while (c < a.size()) {
newArray.add(e, (a.get(c)));
e++;
c++;
}

while (d < b.size()){
newArray.add(e, (b.get(d)));
e++;
d++;
}

return newArray;}

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro"); 

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
