package demo.by.ruslanyagafarov.itpedia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/Contact")
    public String contact(Model model){
        model.addAttribute("title", "Contact");
        return "contact";
    }
}
