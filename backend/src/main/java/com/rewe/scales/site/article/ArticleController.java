package com.rewe.scales.site.article;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping()
    public Page<Article> getAllArticles(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Article> getArticle(@PathVariable Long id) {
       Optional<Article> article = service.findById(id);

       return article.map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Article create(@Valid @RequestBody Article article) {
        return service.save(article);
    }

    @DeleteMapping
    public void delete(long id) {
        service.delete(id);
    }
}
