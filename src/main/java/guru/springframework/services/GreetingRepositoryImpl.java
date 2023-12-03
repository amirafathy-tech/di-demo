package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hi, Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hi, Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Hi, Primärer Grußdienst";

    }
}
