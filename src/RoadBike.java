public class RoadBike extends Bike implements RoadParts {

  private int tyreWidth, postHeight;

  @Override
  public int getTyreWidth() {
    return tyreWidth;
  }

  @Override
  public void setTyreWidth(int newValue) {
    this.tyreWidth = newValue;
  }

  @Override
  public int getPostHeight() {
    return postHeight;
  }

  @Override
  public void setPostHeight(int newValue) {
    this.postHeight = newValue;
  }

  public RoadBike() {
    // to Roadbike, THIS [constructor] is what RoadBike is, hence the *this* keyword
    this("drop", "racing", "tread less", "razor", 19, 20, 22);
  }//end constructor

  public RoadBike(int postHeight) {
    this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
  }//end constructor

  public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
      int tyreWidth, int postHeight) {
    // passing in the parameters of Bike into the object Roadbike
    super(handleBars, frame, tyres, seatType, numGears);
    this.tyreWidth = tyreWidth;
    this.postHeight = postHeight;
  }//end constructor

  public String toString() {

    return super.toString() + "This Roadbike bike has " + this.tyreWidth
        + "mm tyres and a post height of "
        + this.postHeight + ".";
  }//end method printDescription

}//end class RoadBike
