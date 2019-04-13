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

@Controller("/allegro")
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

    @RequestMapping
    //TODO api + attributes
    public ModelAndView getMainPage(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping(value = "/produkt")
    public ModelAndView getProductPage(){
        ModelAndView mav = new ModelAndView("productView");
        mav.addObject("product",productService.getProduct());
        return mav;
    }

    @RequestMapping(value = "/subskrybcja/edytuj")
    public ModelAndView getSubscriptionSummary(){
        ModelAndView mav = new ModelAndView("productOrder");
        Subscription subscription = new Subscription();
//        subscription.setUser(userService.getUser());
//        subscription.setProduct(productService.getProduct());
        mav.addObject(subscription);
        return mav;
    }

    @PostMapping(value = "/subskrypcja/podsumowanie")
    public ModelAndView getSummary(@ModelAttribute("subscription")Subscription subscription){
        ModelAndView mav = new ModelAndView("productOrderSummary");
        subscriptionService.addSubscription(subscription);
        return mav;
    }

    @RequestMapping(value = "/subskrybcja/potwierdz")
    public ModelAndView saveSubscription(){
        ModelAndView mav = new ModelAndView("redirect:/mojesubskrypcje");
        return mav;
    }

    @RequestMapping(value = "/mojesubskrypcje")
    public ModelAndView getUserSubscription(){
        ModelAndView mav = new ModelAndView("mySubscriptions");
//        List<Subscription> subscriptionList = subscriptionService.getSubscriptions(userService.getUser());
//        mav.addObject(subscriptionList);
        return mav;
    }

}
