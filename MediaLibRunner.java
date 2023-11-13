/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    
    Book mybook = new Book("The Lord of the Rings", "Tolkien");
    
    Movie mymovie = new Movie("The Lord of the Rings", 3.5);
    
    System.out.println("Book created " + mybook);
    System.out.println("Movie created " + mymovie);
    
    myLib.addBook(mybook);
    myLib.addMovie(mymovie);
    
    myLib.toString();
    
    System.out.println("Library:\n" + myLib);
    
    int myRating = -1;
    
    mybook.adjustRating(myRating);
    System.out.println(mybook);
    
    mybook.setTitle("TLOTR");
    
    System.out.println("Book:" + mybook);
    System.out.println("Library: " + myLib);


    
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newbook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newbook);
    System.out.println(myLib2);
    newbook = new Book("1984", "Orwell");
    System.out.println(myLib2);
    
    Movie newmovie = new Movie("Matrix", 2.5);
    myLib2.addMovie(newmovie);
    System.out.println(myLib2);

       
    //System.out.println("before test:" + newbook);
   // myLib.testBook(newbook);
    //System.out.println("after test:" + newbook);
    
    mybook.equals(newbook);
    mybook.equals(newmovie);


  }
}