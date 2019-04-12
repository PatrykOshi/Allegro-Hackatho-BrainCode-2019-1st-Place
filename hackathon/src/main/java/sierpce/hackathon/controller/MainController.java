package sierpce.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

//    @GetMapping(name = "/produkt")
//    public ModelAndView getProductPage(@RequestParam("id")String id){
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
//
//    @GetMapping(name = "/subskrybcja/edytuj")
//    public ModelAndView getSubscriptionPage(){
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
//
//    @GetMapping(name = "/subskrypcja/podsumowanie")
//    public ModelAndView get(){
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
//
//    @PostMapping("/subskrybcja/potwierdź")
//    public ModelAndView saveSubscription(){
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }
//
//    @GetMapping(name = "/mojesubskrypcje")
//    public ModelAndView getUserSubscription(){
//        ModelAndView mav = new ModelAndView();
//        return mav;
//    }



}
