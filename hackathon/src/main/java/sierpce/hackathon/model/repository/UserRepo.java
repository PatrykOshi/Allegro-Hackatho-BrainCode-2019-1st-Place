package sierpce.hackathon.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sierpce.hackathon.model.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
