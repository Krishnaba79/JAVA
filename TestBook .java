public class Book 
{
   // The private instance variables
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   // Constructor
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   public String getName() {
      return name;
   }
   
public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public int getQty() {
      return qty;
   }
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   // The toString() describes itself
   public String toString() {
      return "'" + name + "' by " + author;  // author.toString()
   }
}

public class TestBook 
{
   public static void main(String[] args) 
{
      // We need an Author instance to create a Book instance

      Author at = new Author(“ABCD", "ahTeck@gmail.com", 'm');
      System.out.println(at);  // Author's toString()

      // Test Book's constructor and toString()
      Book dummyBook = new Book("Java for dummies", at, 9.99, 99);
      System.out.println(dummyBook);  // Book's toString()

      // Test Setters and Getters
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      
System.out.println(dummyBook);  // Book's toString()
      System.out.println("name is: " + dummyBook.getName());
      System.out.println("price is: " + dummyBook.getPrice());
      System.out.println("qty is: " + dummyBook.getQty());
      System.out.println("author is: " + dummyBook.getAuthor());  
// invoke Author's toString()

      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());

      // Using an anonymous Author instance to create a Book instance
      Book moreDummyBook = new Book("Java for more dummies",
            new Author("Peter Lee", "peter@nowhere.com", 'm'), // an anonymous Author's instance
            19.99, 8);
      System.out.println(moreDummyBook);  // Book's toString()
   }
}
