package com.example.spring_booklib;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final UserRepository userRepository;

    public List<User> getArticles() {
        return userRepository.findAll();
    }

    public User getBook(String isbn) {

    }

    public void postArticle(Article article) {
        userRepository.save(article);
    }

    public User update(User user) {

    }

    public void delete(String isbn) {

    }
}
