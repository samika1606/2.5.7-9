/*
 * Activity 2.5.7
 *
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, int r)
  {
    title = t;
    rating = r;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = " " + title;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }
  
  public boolean equals(Song s){
    if (s.equals(title)){
      if (s.equals(rating)){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  
  public int adjustRating(int r){
    if (r>=0 && r <=10){
      rating+=r;
    }
    
    return rating;
      
  }

}
