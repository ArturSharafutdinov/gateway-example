package ru.tkoinform.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tkoinform.security.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
