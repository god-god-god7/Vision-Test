package vision.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontoller {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "김선필");
        return "greeting";
    }
}
