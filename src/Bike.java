public abstract class Bike implements BikeParts {

  private String handleBars, frame, tyres, seatType;
  private int NumGears;
  private final String make;

  @Override
  public String getHandleBars() {
    return handleBars;
  }

  @Override
  public void setHandleBars(String newValue) {
    this.handleBars = newValue;
  }

  @Override
  public String getTyres() {
    return tyres;
  }

  @Override
  public void setTyres(String newValue) {
    this.tyres = newValue;
  }

  @Override
  public String getSeatType() {
    return seatType;
  }

  @Override
  public void setSeatType(String newValue) {
    this.seatType = newValue;
  }

  public Bike() {
    this.make = "Oracle Cycles";
  }//end constructor

  public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
    this.handleBars = handleBars;
    this.frame = frame;
    this.tyres = tyres;
    this.seatType = seatType;
    NumGears = numGears;
    this.make = MAKE;
  }//end constructor


  public String toString() {
    return "\n" + this.make + "\n"
        + "This bike has " + this.handleBars + " handlebars on a "
        + this.frame + " frame with " + this.NumGears + " gears."
        + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres. \n";
  } //end method printDescription

}//end class Bike
	
	

