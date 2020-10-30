package employeePackage.staticExample;

/*
    static variables --> are not instance variables
    which apply to an individual object. They are class
    level objects that apply to the entire class.

    static methods --> abilities of the entire class are
    not of an individual object/instance. These are run
    through the class itself and not an object.

*/

public class Blob {
    private String name;
    private static int blobCount = 0; // Applies to the entire class, not the object itself. 
    
    public Blob(String name) {
        this.name = name;
        blobCount = blobCount + 1;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static int getBlobCount() {
        return blobCount;
    }
}
