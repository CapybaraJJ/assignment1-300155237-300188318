// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 
import java.util.Scanner;
import java.io.*;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest
{
  //Class methods *****************************************************


  public static void main(String[] args)
  {
	  

	
	  
    PointCP2 point;
    PointCP3 point3;
    PointCP5 point5;
    
    char coordtype;
    
    Scanner sc = new Scanner(System.in);
    
    int testcounter = 1;
    
    while (testcounter != 0) {
    	
    	System.out.println("Please enter 1 to test PointCP2, enter 2 to test PointCP3, enter 3 to test PointCP5, and 0 to exit: ");    	
    	testcounter = sc.nextInt();    	
    	
    		
    	if (testcounter == 0) {
    		return;
    		
    	}else if (testcounter == 1) {
    		
    		long startTime = System.currentTimeMillis();
    	    for(int index=0;index<100000000;index++) {
    	    	new PointCP2('C', 5.1, 3.2);  	  
    	    }
    	    long endTime = System.currentTimeMillis();
    	    System.out.println("Total time is " + (endTime - startTime) + " milliseconds");
    	    
    	     	  

    	  
    	}else if (testcounter == 2) {
    		
    		long startTime = System.currentTimeMillis();
    	    for(int index=0;index<1000000000;index++) {
    	    	new PointCP3('P', 8.1, 4.2);  	  
    	    }
    	    long endTime = System.currentTimeMillis();
    	    System.out.println("Total time is " + (endTime - startTime) + " milliseconds");
    	
    		
    		
    	}else if (testcounter == 3){
    		
    		long startTime = System.currentTimeMillis();
    	    for(int index=0;index<100000000;index++) {
    	    	PointCPC test = new PointCPC('C', 8.1, 4.2); 
    			test.convertStorageToPolar();
    			test.getDistance(test);
    	    }
    	    long endTime = System.currentTimeMillis();
    	    System.out.println("Total time is " + (endTime - startTime) + " milliseconds for C");
    	    
    	    
    	    startTime = System.currentTimeMillis();
    	    for(int index=0;index<100000000;index++) {
    	    	PointCP3P temp2 = new PointCP3P('P', 8.1, 4.2);  
    	    	temp2.convertStorageToCartesian();
    			temp2.rotatePoint(3);
    	    }
    	    endTime = System.currentTimeMillis();
    	    System.out.println("Total time is " + (endTime - startTime) + " milliseconds for P");
    		
    		
    		
    	}else {
    		System.out.println("bad input you silly goose, now I'm going to terminate the program because you can't follow instructions");
    		return;
    	}
    }
  }
}