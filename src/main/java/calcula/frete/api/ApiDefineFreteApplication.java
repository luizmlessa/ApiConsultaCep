package calcula.frete.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "calcula.frete.api.*")
@EntityScan("calcula.frete.api.*")
public class ApiDefineFreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDefineFreteApplication.class, args);

	}



}
