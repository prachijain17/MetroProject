package Entities;

public class StationsTravelled {
   private String source;
   private String destination;
   private int fare;
   
   
   public StationsTravelled(String source) {
	  this.source=source;
	  
   }
   @Override
public String toString() {
	return "StationsTravelled [source=" + source + ", destination=" + destination + ", fare=" + fare + "]";
}
public StationsTravelled(String destination,int fare) {
		 this.destination=destination;
		 this.fare=fare;
		  
	   }
   
   // getter and setter methods
    public String getSource() {
	return source;
}
   public void setSource(String source) {
	this.source = source;
}
   public String getDestination() {
	return destination;
}
   public void setDestination(String destination) {
	this.destination = destination;
}
    public int getFare() {
	return fare;
}
   public void setFare(int fare) {
	this.fare = fare;
}
}
