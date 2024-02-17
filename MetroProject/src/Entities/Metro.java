package Entities;

public class Metro {
   private String source;
   private String destination;
   private int fare;
   
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

public Metro(String source, String destination, int fare) {
	super();
	this.source = source;
	this.destination = destination;
	this.fare = fare;
}
   
   
}
