package one.digitalinnovation.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram utilizados:
 *  - Spring Data JPA
 *  - Spring Web
 *  - MySQL Database Driver
 *  - OpenFeign
 *
 * @author Luiz Gustavo
 */

@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Cadastro Clientes / Endereço", version = "1.0", description = "API utilizada para cadastro de clientes com endereço, utiliza a API ViaCEP para realização do cadastro."))
public class ProjectPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPatternsSpringApplication.class, args);
	}

}
