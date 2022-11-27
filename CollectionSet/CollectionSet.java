import java.util.*;
import java.io.*;
class DuplicateKeyException extends Exception{
}
class Book{
  int Book_ID;
  String Book_Title;
  String Book_Author;
  String Book_Publisher;
  int Book_Quantity;

  public Book(int Book_ID, String Book_Title, String Book_Author, String Book_Publisher, int Book_Quantity){
    this.Book_ID = Book_ID;
    this.Book_Title = Book_Title;
    this.Book_Author = Book_Author;
    this.Book_Publisher = Book_Publisher;
    this.Book_Quantity = Book_Quantity;
  }

  public String toString(){
    return Book_ID + "--> " + Book_Title + "--> " + Book_Author + "-> " + Book_Publisher + "--> " + Book_Quantity;
  }

  public boolean equals(Object O){
    return (this.Book_ID == ((Book) O).Book_ID);
  }

  public int hashCode(){
    return Book_ID;
  }

}

class SetDemo{
  //static Book b;
  public static void main(String[] args) {
    HashSet<Book>library = new HashSet<Book>();
    Book b1 = new Book(101, "lets C","Karan","India",12);
    Book b2 = new Book(102, "lets Java","Agnieszka","Poland",10);
    Book b3 = new Book(103, "lets Python","Alka","India",66);
    // add to Set
    library.add(b1);
    library.add(b2);
    library.add(b3);
    for(Book b:library)
    System.out.println(b);
    System.out.println("B4 Added");
    Book b4 = new Book(103, "lets Python","Alka","India",66);
    library.add(b4);
    library.add(b3);
    Iterator<Book> itr = library.iterator();
    while(itr.hasNext()){
      Book b = itr.next();
      System.out.println(b);
    }
    LinkedHashSet<Integer>Value = new LinkedHashSet<Integer>();
try{
  if(Value == Value)
  throw new DuplicateKeyException();
  }
  catch(DuplicateKeyException e){
    System.out.println("Duplicate Catch Error But Removed " );
    e.getStackTrace();
  }
  finally{
    Value.add(10);
    Value.add(20);
    Value.add(30);
    Value.add(40);
    Value.add(40);
  }
Iterator<Integer> it = Value.iterator();

while(it.hasNext()) {
  Integer i = it.next();
  System.out.println(i);
  }

  }
}
