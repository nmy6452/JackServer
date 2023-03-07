package nmy.Jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JackApplication.class, args);
	}

}
