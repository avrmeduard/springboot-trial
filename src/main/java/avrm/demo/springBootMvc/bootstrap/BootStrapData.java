package avrm.demo.springBootMvc.bootstrap;

import avrm.demo.springBootMvc.domain.Author;
import avrm.demo.springBootMvc.domain.Book;
import avrm.demo.springBootMvc.domain.Publisher;
import avrm.demo.springBootMvc.repositories.AuthorRepository;
import avrm.demo.springBootMvc.repositories.BookRepository;
import avrm.demo.springBootMvc.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository , BookRepository bookRepository , PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("BootStrap started ...");

        Publisher publisher = new Publisher();
        publisher.setName("Nemira Publisher");
        publisher.setAdressLine("Bd. Victoriei 138");
        publisher.setCity("Bucharest");

        publisherRepository.save(publisher);
        System.out.println("Publisher added are : " + publisherRepository.count());

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

        System.out.println("Number of books added : " + bookRepository.count());

    }
}
