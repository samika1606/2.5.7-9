/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }
  public void addMovie(Movie m)
  {
    movie = m;
  }

  public String toString() 
  {
    //String info = " " + book;
    String info =  " " + book + " " + movie;
    
    return info;
  }
  
   public void testBook(Book test){
     
     System.out.println(test);
     
   }
}