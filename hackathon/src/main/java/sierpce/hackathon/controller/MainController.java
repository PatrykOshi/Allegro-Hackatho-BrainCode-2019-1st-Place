package sierpce.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(name = "/allegro")
public class MainController {

    @GetMapping(name = "/produkty")
    //TODO api + attributes
    public ModelAndView getMainPage(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

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
    public ModelAndView saveSubscription(){
        ModelAndView mav = new ModelAndView("redirect:/mojesubskrypcje");
        return mav;
    }

    @GetMapping(name = "/mojesubskrypcje")
    public ModelAndView getUserSubscription(){
        ModelAndView mav = new ModelAndView("mySubscriptions");
        return mav;
    }



}
