
public class PointCPC extends PointCP5 {

	
	private char typeCoord;
	  
	  /**
	   * Contains the current value of X or RHO depending on the type
	   * of coordinates.
	   */
	  private double xOrRho;
	  
	  /**
	   * Contains the current value of Y or THETA value depending on the
	   * type of coordinates.
	   */
	  private double yOrTheta;
		
	  
	  //Constructors ******************************************************

	  /**
	   * Constructs a coordinate object, with a type identifier.
	   */
	  public PointCPC(char type, double xOrRho, double yOrTheta)
	  {
	    if(type != 'C' && type != 'P')
	      throw new IllegalArgumentException();
	    this.xOrRho = xOrRho;
	    this.yOrTheta = yOrTheta;
	    typeCoord = type;
	  }
		
	  
	  //Instance methods **************************************************
	 
		
		
	
}
