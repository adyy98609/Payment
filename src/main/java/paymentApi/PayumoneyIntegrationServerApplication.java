package paymentApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PayumoneyIntegrationServerApplication extends SpringBootServletInitializer {

	private static Class applicationClass = PayumoneyIntegrationServerApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(PayumoneyIntegrationServerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}
}
