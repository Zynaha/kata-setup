package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TripService {

	/**
	 * @deprecated Use {@link #getTripsByUser(User,User)} instead
	 */
	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		return getTripsByUser(user, UserSession.getInstance().getLoggedUser());
	}

	public List<Trip> getTripsByUser(User user, User loggedUser2) throws UserNotLoggedInException {
		boolean isFriend = false;
		if (loggedUser2 != null) {
			for (User friend : user.getFriends()) {
				if (friend.equals(loggedUser2)) {
					isFriend = true;
					break;
				}
			}
			return isFriend? findTripsBy(user):new ArrayList<Trip>();
		}
		return null;
	}


	protected List<Trip> findTripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}
	
}
