package demo.by.ruslanyagafarov.itpedia.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    @GetMapping("/Products")
    public String home(Model model) {
        model.addAttribute("title", "Products");
        return "products";
    }
}
