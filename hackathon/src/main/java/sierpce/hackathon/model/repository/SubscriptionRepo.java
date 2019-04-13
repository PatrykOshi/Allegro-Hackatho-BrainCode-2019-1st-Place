package sierpce.hackathon.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sierpce.hackathon.model.entity.Subscription;
import sierpce.hackathon.model.entity.User;

import java.util.List;

@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {

    public List<Subscription> findByUser(int userId);

}
