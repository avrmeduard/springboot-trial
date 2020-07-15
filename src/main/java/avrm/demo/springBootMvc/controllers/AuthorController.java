package avrm.demo.springBootMvc.controllers;

import avrm.demo.springBootMvc.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/author")
    public String getAuthor(Model model) {

        model.addAttribute("author", authorRepository.findAll());
        return "author/list";
    }
}
