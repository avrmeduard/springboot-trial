package avrm.demo.springBootMvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookControler {

    @RequestMapping("/books")
    public String getBooks(Model model) {

        return "books";
    }
}
