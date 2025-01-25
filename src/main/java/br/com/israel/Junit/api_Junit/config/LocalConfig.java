package br.com.israel.Junit.api_Junit.config;

import br.com.israel.Junit.api_Junit.domain.User;
import br.com.israel.Junit.api_Junit.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    @Transactional
    public void startDB(){
        User u1 = new User(null, "Israel","israel@email.com","123");
        User u2 = new User(null, "Ze","ze@email.com","123");

        repository.saveAll(List.of(u1,u2));
    }
}
