package restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/findall")
    public HashSet<Book> getAllBook() {
        return bookService.findAllBook();
    }

    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookService.findBookByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteBook() {
        bookService.deleteAllData();
    }

}