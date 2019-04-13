package sierpce.hackathon.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sierpce.hackathon.model.entity.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Integer> {
}
