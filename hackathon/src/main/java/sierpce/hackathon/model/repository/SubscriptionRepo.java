package sierpce.hackathon.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sierpce.hackathon.model.entity.Subscription;

@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {
}
