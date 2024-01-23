package Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CoffeeManagementSystemApplication {
 	@Autowired
	private sendEmail send;
	public static void main(String[] args) {
		SpringApplication.run(CoffeeManagementSystemApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class) 
	public void sendmail(){
	send.send(SignUpView.emailAdd, "Email Verification",Integer.toString(SignUpView.otp));
	}

}
