package poseidon.spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import poseidon.spring.services.BookService;

@AllArgsConstructor
@Controller
public class BookController {

    private final BookService bookService;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
