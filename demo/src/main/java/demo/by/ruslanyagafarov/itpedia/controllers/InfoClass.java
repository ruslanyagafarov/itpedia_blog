package demo.by.ruslanyagafarov.itpedia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoClass {
    @GetMapping("/FAQ")
    public String info(Model model){
        model.addAttribute("title", "FAQ");
        return "info";
    }
}
