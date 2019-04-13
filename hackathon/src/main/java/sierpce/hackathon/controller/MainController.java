package sierpce.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sierpce.hackathon.model.entity.Product;
import sierpce.hackathon.model.entity.Subscription;
import sierpce.hackathon.model.entity.Vendor;
import sierpce.hackathon.service.ProductService;
import sierpce.hackathon.service.SubscriptionService;
import sierpce.hackathon.service.UserService;
import sierpce.hackathon.service.VendorService;

import java.util.List;

@Controller
@RequestMapping(name = "/allegro")
public class MainController {

    @Autowired
    private SubscriptionService subscriptionService;
    @Autowired
    private VendorService vendorService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @GetMapping(name = "/produkty")
    //TODO api + attributes
    public ModelAndView getMainPage(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
<<<<<<< HEAD

    @GetMapping(name = "/produkt")
    public ModelAndView getProductPage(){
        ModelAndView mav = new ModelAndView("productView");
        return mav;
    }

    @GetMapping(name = "/subskrybcja/edytuj")
    public ModelAndView getSubscriptionSummary(){
        ModelAndView mav = new ModelAndView("productOrder");
        return mav;
    }

    @GetMapping(name = "/subskrypcja/podsumowanie")
    public ModelAndView get(){
        ModelAndView mav = new ModelAndView("productOrderSummary");
        return mav;
    }

    @PostMapping("/subskrybcja/potwierdz")
    public ModelAndView saveSubscription(@ModelAttribute("subscription")Subscription subscription){
        ModelAndView mav = new ModelAndView("redirect:/mojesubskrypcje");
        subscriptionService.addSubscription(subscription);
        return mav;
    }

    @GetMapping(name = "/mojesubskrypcje")
    public ModelAndView getUserSubscription(){
        ModelAndView mav = new ModelAndView("mySubscriptions");
        List<Subscription> subscriptionList = subscriptionService.getSubscriptions(userService.getUser());
        mav.addObject(subscriptionList);
        return mav;
    }

}
