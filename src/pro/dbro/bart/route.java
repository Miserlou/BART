package pro.dbro.bart;

import java.util.ArrayList;
import java.util.Date;

public class route {
	public double fare;
	public Date departureDate;
	public Date arrivalDate;
	public ArrayList legs;
	
	public route(){
		legs = new ArrayList();
	}
	
	public leg addLeg(){
		leg newLeg = new leg();
		legs.add(newLeg);
		return newLeg;
	}
	
	public leg getLastLeg(){
		return (leg)legs.get(legs.size()-1);
	}

}