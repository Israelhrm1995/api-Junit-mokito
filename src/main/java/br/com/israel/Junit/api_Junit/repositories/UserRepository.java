package br.com.israel.Junit.api_Junit.repositories;

import br.com.israel.Junit.api_Junit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
