package com.example.spring_booklib;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/lib")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/books")
    List<User> getAll() {
        return articleService.getArticles();
    }

    @GetMapping("{isbn}")
    User getBook(@PathVariable String isbn) {
        return
    }

    @PostMapping
    void postArticle(@RequestBody Article article) {
        articleService.postArticle(article);
    }

    @PutMapping(path = {"{id}/update", "{id}"})
    User update(@PathVariable String isbn, @RequestBody User user) {
        if (!user.isbn.equals(isbn)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The isbn in the url does not match the request bodies isbn");
        }
        return
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable String isbn) {

    }
}
