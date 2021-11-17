package mockito.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.rules.Verifier;
import org.mockito.Mockito;

import mockito.clients.ClientRepository;
import mockito.notification.Mailer;

public class MaillerBirthdayServiceTest {
 
  
@Test
public void by_default_return_good_morning() {
	//Given
	ClientRepository repository = Mockito.mock(ClientRepository.class) ;
	Mailer mailer = Mockito.mock(Mailer.class) ;
	BirthdayService birthdayService=new BirthdayService(repository);


	//When 
	 birthdayService.greeting("AmaZ");
 
	//Then 
//	assertEquals( actual); mailer.send("Good morning AmaZ.");
}
@Test
public void return_happy_birthday() {
	//Given
	ClientRepository repository = Mockito.mock(ClientRepository.class) ;
	BirthdayService birthdayService=new BirthdayService(repository);
	
	
	//When 
	Mockito.when(repository.birthdayIsTodayFor("AmaZ")).thenReturn(true);	
	String greeting =birthdayService.greeting("AmaZ");
	//Then 
	assertEquals(greeting,"Happy birthday AmaZ!");
}




}
