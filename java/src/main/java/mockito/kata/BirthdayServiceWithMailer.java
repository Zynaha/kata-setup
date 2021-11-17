package mockito.kata;

import mockito.notification.Mailer;
import mockito.clients.ClientRepository;

public class BirthdayServiceWithMailer {
  
  private ClientRepository repository;
  private Mailer mailer;

  public BirthdayServiceWithMailer(ClientRepository repository, Mailer mailer) {
    this.repository = repository;
    this.mailer = mailer;
    
  }
  
  public void greeting(String name) {
    
    String greeting;
    
    if (repository.birthdayIsTodayFor(name)) {
      greeting = "Happy birthday " + name + "!";
    } else {
      greeting = "Good morning " + name + ".";
    }
    
    mailer.send(greeting);
    
  }

}
