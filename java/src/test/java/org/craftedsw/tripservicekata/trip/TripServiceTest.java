package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TripServiceTest {
	TripService tripService=new TripService();
	
    @Test(expected =UserNotLoggedInException.class )
	public void name() {
	  tripService.getTripsByUser(null, new User());
	  /*Assertions.assertThrows(UserNotLoggedInException.class, ()->{
		tripService.getTripsByUser(null, new User());
	});*/
    	
	}
}
