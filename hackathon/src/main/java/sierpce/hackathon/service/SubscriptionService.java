package sierpce.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sierpce.hackathon.model.entity.Subscription;
import sierpce.hackathon.model.entity.User;
import sierpce.hackathon.model.repository.SubscriptionRepo;

import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepo subscriptionRepo;


    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }

    public List<Subscription> getSubscriptions(User user){
        return subscriptionRepo.findByUser(user.getId());
    }

}
