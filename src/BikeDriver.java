public class BikeDriver {

  public static void main(String[] args) {

    // Bike bike1 = new RoadBike(); would be an example of polymorphism, making a Bike as a new Roadbike
    RoadBike bike1 = new RoadBike();
    RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
    MountainBike bike3 = new MountainBike();
    // Bike bike4 = new Bike();

    System.out.println(bike1.toString());
    System.out.println(bike2.toString());
    System.out.println(bike3.toString());

    Bike myBikes[] = { bike1, bike2, bike3 };
    for (Bike b : myBikes) {
      myBikes.toString(); // virtual method invocation - this could go anywhere
    }

  }//end method main

}//end class BikeDriver
