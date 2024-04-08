package com.example.spring_booklib;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private Date articleDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
