/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeePackage.staticExample;

/**
 *
 * @author jame1850
 */
public class BlobMaker {

    
    public static void main(String[] args) {
        Blob a, b, c;
        a = new Blob("Joey");
        b = new Blob("Frankie");
        c = new Blob("Moe");
        
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        
        System.out.format("There are %d blobs!", Blob.getBlobCount());
    }
    
}
