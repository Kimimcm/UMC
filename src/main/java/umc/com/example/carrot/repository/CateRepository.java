package umc.com.example.carrot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.com.example.carrot.entity.Category;
public interface CateRepository extends JpaRepository<Category,Long> {
}
