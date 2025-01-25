package br.com.israel.Junit.api_Junit.services.impl;

import br.com.israel.Junit.api_Junit.domain.User;
import br.com.israel.Junit.api_Junit.repositories.UserRepository;
import br.com.israel.Junit.api_Junit.services.UserService;
import br.com.israel.Junit.api_Junit.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj =  repository.findById(id);
        return obj.orElseThrow(()->new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
