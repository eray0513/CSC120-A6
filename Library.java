// import Hashtable class
import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building{

    // Creates a hashtable to store the books and whether they are available
    private Hashtable<String, Boolean> collection;

    /**
     * Constructs a library object that uses the building superclass and initializes the collection to be empty
     * @param name name of library (superclass)
     * @param address address of library (superclass)
     * @param nFloors number of floors (superclass)
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * Add a title to the collection and set it to available (true)
     * @param title
     */
    public void addTitle(String title){
      this.collection.put(name, true);
    }

    public String removeTitle(String title){

    }

    public boolean containsTitle(String title){
      
    }

  
    public static void main(String[] args) {
      new Library("Neilson", "1 Green St", 4);
    }
  
  }