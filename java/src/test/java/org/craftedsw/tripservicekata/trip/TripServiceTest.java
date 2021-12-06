package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TripServiceTest {
	TripService tripService=new TripService();
	
    //@Test(expected =UserNotLoggedInException.class )
	@Test
	public void throw_exception_when_user_not_logged() {
	  //tripService.getTripsByUser(null, null);
	  Assertions.assertThrows(UserNotLoggedInException.class, ()->{
		tripService.getTripsByUser(null, null);
	});
    	
	}
    
    
    
}
