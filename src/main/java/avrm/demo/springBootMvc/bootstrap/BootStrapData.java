package avrm.demo.springBootMvc.bootstrap;

import avrm.demo.springBootMvc.domain.Author;
import avrm.demo.springBootMvc.domain.Book;
import avrm.demo.springBootMvc.repositories.AuthorRepository;
import avrm.demo.springBootMvc.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository , BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author ion = new Author("Ion", "Creanga");
        Book capra = new Book("Capra cu 3 iezi", "42493077");

        ion.getBooks().add(capra);
        capra.getAuthors().add(ion);
        authorRepository.save(ion);
        bookRepository.save(capra);

        Author mih = new Author("Mihai", "Eminescu");
        Book poezii = new Book("Luceafarul", "99328290");

        mih.getBooks().add(poezii);
        poezii.getAuthors().add(mih);
        authorRepository.save(mih);
        bookRepository.save(poezii);

        System.out.println("Bootstrap started \n Number of books added : " + bookRepository.count());

    }
}
