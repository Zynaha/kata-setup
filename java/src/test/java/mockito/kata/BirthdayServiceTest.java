package mockito.kata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import mockito.clients.ClientRepository;

public class BirthdayServiceTest {
 
  
@Test
public void by_default_return_good_morning() {
	//Given
	ClientRepository repository = Mockito.mock(ClientRepository.class) ;
	BirthdayService birthdayService=new BirthdayService(repository);


	//When 
	String greeting =birthdayService.greeting("AmaZ");
 
	//Then 
	assertEquals(greeting,"Good morning AmaZ.");
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
