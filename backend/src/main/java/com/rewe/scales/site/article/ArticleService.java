package com.rewe.scales.site.article;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    ArticleRepository repo;

    ArticleService(ArticleRepository repo) {
        this.repo = repo;
    }

    Page<Article> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    Article save(Article article) {
        return repo.save(article);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
