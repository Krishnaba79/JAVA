public class Author 
{
   // The private instance variables
   private String name;
   private String email;
   private char gender;   // 'm' or 'f'
 
   // The constructor
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
 
   // The public getters and setters for the private instance variables.
   // No setter for name and gender as they are not designed to be changed.
   public String getName()
 {
      return name;
   }

public char getGender() {
      return gender;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
 
   // The toString() describes itself
   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
}

public class TestAuthor
 {
   public static void main(String[] args)
 {
      // Test constructor and toString()
      Author at = new Author(“ABCD", "teck@gmail.com", 'm');
      System.out.println(at); 		 // toString()

      // Test Setters and Getters

      at.setEmail("teck@somewhere.com");
      System.out.println(at);  		// toString()
      System.out.println("name is: " + at.getName());
      System.out.println("gender is: " + at.getGender());
      System.out.println("email is: " + at.getEmail());
   }
}

