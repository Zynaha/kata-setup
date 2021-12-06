package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.junit.Test;

public class TripServiceTest {
	TripService tripService=new TripService();
	
    @Test 
	public void name() {
	  tripService.getTripsByUser(null, null);
	}
}
