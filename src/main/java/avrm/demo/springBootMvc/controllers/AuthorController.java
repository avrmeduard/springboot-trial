package avrm.demo.springBootMvc.controllers;

import avrm.demo.springBootMvc.repositories.AuthorRepository;
import org.springframework.ui.Model;

public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public String getAuthor(Model model) {

        model.addAttribute("author", authorRepository.findAll());
        return "author";
    }
}
