package guru.springframework.config;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingServiceFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {

        return new GreetingServiceFactory(greetingRepository);

    }
}
