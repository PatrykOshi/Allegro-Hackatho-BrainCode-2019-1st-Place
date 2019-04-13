package sierpce.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sierpce.hackathon.model.repository.VendorRepo;

@Service
public class VendorService {

    @Autowired
    private VendorRepo vendorRepo;


}
