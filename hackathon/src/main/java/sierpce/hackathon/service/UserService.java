package sierpce.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sierpce.hackathon.model.entity.User;
import sierpce.hackathon.model.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUser(){
        return userRepo.findAll().get(0);
    }

}
