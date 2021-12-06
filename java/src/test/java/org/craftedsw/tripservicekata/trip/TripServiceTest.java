package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TripServiceTest {
	TripService tripService = new TripService();

	// @Test(expected =UserNotLoggedInException.class )
	@Test
	public void throw_exception_when_user_not_logged() {
		// tripService.getTripsByUser(null, null);
		Assertions.assertThrows(UserNotLoggedInException.class, () -> {
			tripService.getTripsByUser(null, null);
		});

	}
	@Test
	public void name() {
		User traveller = new User();
		User userLogged = new User();
		tripService.getTripsByUser(traveller, userLogged);
	}

    TripService service = new TripService();

    @Test
    void throws_exception_for_guests() throws Exception {
        Assertions.assertThrows(UserNotLoggedInException.class, () -> service.getTripsByUser(null, null));
    }

    @Test
    void no_trips_when_user_has_no_friends() throws Exception {
        User user1 = new User(); // TODO find good name
        User loggedUser = new User();
        List<Trip> result = service.getTripsByUser(user1, loggedUser);
        assertThat(result).isEmpty();
    }

    @Test
    public void name1() throws Exception {
        User user1 = new User(); // TODO find good name
        User loggedUser = new User();
        user1.addFriend(loggedUser);
        service = new TripService() { // on pourrait faire ceci avec Mockito.spy
            @Override
            protected List<Trip> findTripsBy(User user) {
                return Arrays.asList(new Trip(), new Trip());
            }
        };


        List<Trip> result = service.getTripsByUser(user1, loggedUser);
        assertThat(result).hasSize(2);

    }

}
