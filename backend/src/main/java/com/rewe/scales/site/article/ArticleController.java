package com.rewe.scales.site.article;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {

    ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Article> getAllArticles(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public Article create(Article article) {
        return service.save(article);
    }

    @DeleteMapping
    public void delete(long id) {
        service.delete(id);
    }
}
