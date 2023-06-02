package umc.com.example.carrot.repository;

import umc.com.example.carrot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}