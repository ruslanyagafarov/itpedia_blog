package demo.by.ruslanyagafarov.itpedia.controllers;

import demo.by.ruslanyagafarov.itpedia.models.Post;
import demo.by.ruslanyagafarov.itpedia.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// класс который отвечает за обработку всех переходов на сайте
@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/Blog")
    public String blogMain(Model model) {
        // в этом объекте на основе класса Iterable будут храниться все значения из таблицы в БД
        Iterable<Post> posts = postRepository.findAll(); // функция findAll вытягивает все записи из таблицы Post
        // обращение к модели свойство addAttribute. в шаблон blog-main будет передавать все найденные посты
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/Blog/Add")
    public String blogAdd(Model model) {
        return "blog-add";
    }

    // получаем данные из формы при помощи метода post
    @PostMapping("/Blog/Add")
    public String blogPostAdd(@RequestParam String title,@RequestParam String anons, @RequestParam String full_text, Model model){
        Post post = new Post(title, anons, full_text);
        postRepository.save(post); // в таблицу передается статья которую мы получили от пользователя
        return "redirect:/Blog";
    }
}
