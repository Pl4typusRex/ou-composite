
/**
 * Objects of the Author class represent an author and stores their name, nationality and how many
 * books they've written.
 *
 * TMA02 Q2
 * @author Pl4typusRex
 * @version 2019-01
 */
public class Author
{
   // instance variables
   private String name;
   private String nationality;
   private int booksWritten;

   /**
    * Constructor for objects of class Author
    * where all attributes are known
    */
   public Author(String aName, String aNationality, int totalBooks)
   {
      // initialise instance variables
      name = aName;
      nationality = aNationality;
      booksWritten = totalBooks;
   }

   /**
    * Zero argument constructor for when no attributes are known
    * Used within the second Book() constructor where Author not known
    *
    * if they're an author they've written at least one book
    * so the default value is set to 1 if the author is unknown
    */
   public Author()
   {
      // initialise instance variables
      this(null, null, 1);
   }

   /**
    * Getter method for author's name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Getter method for author's nationality
    */
   public String getNationality()
   {
      return nationality;
   }

   /**
    * Getter method for author's total books written
    */
   public int getBooksWritten()
   {
      return booksWritten;
   }

   /**
    * Setter method for author's name
    */
   public void setName(String aName)
   {
      name = aName;
   }

   /**
    * Setter method for author's nationality
    */
   public void setNationality(String aNationality)
   {
      nationality = aNationality;
   }

   /**
    * Setter method for author's booksWritten
    */
   public void setBooksWritten(int books)
   {
      booksWritten = books;
   }

   /**
    * Returns a string describing the object
    */
   public String toString()
   {
      return nationality + " author " + name + " has written " + booksWritten + " books";
   }
}
