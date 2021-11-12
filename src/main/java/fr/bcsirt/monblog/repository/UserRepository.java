package fr.bcsirt.monblog.repository;

import fr.bcsirt.monblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

     Optional<User> findByUserName(String username);
}
