package sierpce.hackathon.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Subscription")
public class Subscription{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate subscriptionDate;

    @Column
    private double maxPrice;

    @Column
    private String paymentMethod;

    @Column
    private String frequency;


    @ManyToOne()
    @JoinColumn(name = "fk_user")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "fk_product")
    private Product product;

    public Subscription() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
