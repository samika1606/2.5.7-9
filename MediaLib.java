/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;//2.5.8

  public static String owner = "PlTW";//2.5.8
  private static int numEntries = 0;//2.5.8
  private static int bookEntries = 0;//2.5.8
  private static int movieEntries = 0;//2.5.8
    private static int songEntries = 0; //2.5.8

  public void addBook(Book b) {
    book = b;
    if (book == null){//2.5.8
      numEntries+=1;//2.5.8
      bookEntries+=1;//2.5.8
    }
    else{
      System.out.println("There is already a book in the library.");
    }

  }

  public void addMovie(Movie m) {
    movie = m;
    if (movie == null){//2.5.8
      numEntries+=1;//2.5.8
      movieEntries+=1;//2.5.8
    }
    else{
      System.out.println("There is already a movie in the library.");
    }
  }
//2.5.8
  public void addSong(Song s) {
    song = s;
    if (song == null){
      numEntries+=1;
      songEntries+=1;
    }
    else{
      System.out.println("There is already a song in the library.");
    }

  }

  public String toString() {
    // String info = " " + book;
    String info = " " + book + " " + movie + " " + song; //2.5.8

    return info;
  }

  public void testBook(Book test) {

    System.out.println(test);

  }

  public static String getOwner() {
    return owner;
  }

  public static int getNumEntries(){
    return numEntries;
  }

  public static String changeOwner(String newInput)
  {
    owner = newInput;
    return owner;
  }
}