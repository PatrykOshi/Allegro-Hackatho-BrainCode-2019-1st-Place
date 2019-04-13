package sierpce.hackathon.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sierpce.hackathon.model.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
}
