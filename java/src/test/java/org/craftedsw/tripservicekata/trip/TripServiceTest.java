package org.craftedsw.tripservicekata.trip;

import java.util.List;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TripServiceTest {
	TripService tripService=new TripService();
	
    @Test 
	public void name() {
	  //tripService.getTripsByUser(null, new User());
	  List<Trip> tripsByUser = tripService.getTripsByUser(null, new User());
	Assertions.assertThrows(UserNotLoggedInException.class, tripsByUser);
	}
}
