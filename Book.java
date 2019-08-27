
/**
 * Objects of the Book class model on a basic level particular attributes of a real world book;
 * the name, the author and the genre.
 *
 * The author is an object of class Author making this a composite class.
 *
 * TMA02 Q2
 * @author Pl4typusRex 
 * @version 2019-01
 */
public class Book
{
   // instance variables
   private String name;
   private Author author;
   private String genre;

   /**
    * Constructor for objects of class Book
    * where all attributes are known
    */
   public Book(String aName, Author anAuthor, String aGenre)
   {
      // initialise instance variables
      name = aName;
      author = anAuthor;
      genre = aGenre;
   }

   /**
    * Constructor for objects of class Book
    * where author attribute is not known
    */
   public Book(String aName, String aGenre)
   {
      // initialise instance variables
      name = aName;
      author = new Author();
      genre = aGenre;
   }

   /**
    * Returns the number of other books attributed to the author
    */
   public int howManyOther()
   {
      return (author.getBooksWritten() - 1);
   }

   /**
    * Getter method for a book's name
    */
   public String getTitle()
   {
      return name;
   }

   /**
    * Getter method for a book's author
    */
   public String getAuthor()
   {
      if (author.getName() == null)
      {
         return "Author unknown";
      } else
      {
         return author.getName();
      }
   }

   /**
    * Getter method for a book's genre
    */
   public String getGenre()
   {
      return genre;
   }

   /**
    * Setter method for a book's name
    */
   public void setTitle(String aName)
   {
      name = aName;
   }

   /**
    * Setter method for a book's author name
    */
   public void setAuthorName(String aName)
   {
      author.setName(aName);
   }

   /**
    * Setter method for a book's author name
    */
   public void setGenre(String aGenre)
   {
      genre = aGenre;
   }

   /**
    * Returns a string describing the object
    */
   public String toString()
   {
      return "Title: " + name + " Genre: " + genre + "| Author: " + getAuthor()
               + " Other books: " + author.getBooksWritten();
   }
}
