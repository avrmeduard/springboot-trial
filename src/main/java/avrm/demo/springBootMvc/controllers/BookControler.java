package avrm.demo.springBootMvc.controllers;

import avrm.demo.springBootMvc.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookControler {

    private BookRepository bookRepository;

    public BookControler(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books",bookRepository.findAll());
        return "books/list";
    }
}
