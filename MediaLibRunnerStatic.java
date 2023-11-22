/* 
public class MediaLibRunnerStatic {
  // Everything below is 2.5.8
  public static void main(String[] args) {
    MediaLib.owner = "hi";
    System.out.println(MediaLib.owner + "'s Library");

    //System.out.println(MediaLib.getNumEntries());

    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book mybook = new Book("The Lord of the Rings", "Tolkien");

    Movie mymovie = new Movie("The Lord of the Rings", 3.5);

    Song mysong = new Song("Happy", 3);

    System.out.println("Book created " + mybook);
    System.out.println("Movie created " + mymovie);

    myLib.addBook(mybook);
    myLib.addMovie(mymovie);

    System.out.println("Test: Owner is " + MediaLib.owner);
  }

}

*/