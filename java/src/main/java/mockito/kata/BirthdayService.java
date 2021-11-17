package mockito.kata;

import mockito.clients.ClientRepository;

public class BirthdayService {
  
  private ClientRepository repository;

  public BirthdayService(ClientRepository repository) {
    this.repository = repository;
    
  }
  
  public String greeting(String name) {
    
    String greeting;
    
    if (repository.birthdayIsTodayFor(name)) {
      greeting = "Happy birthday " + name + "!";
    } else {
      greeting = "Good morning " + name + ".";
    }
    
    return greeting;
    
  }

}
