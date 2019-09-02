package com.rewe.scales.site.article;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class ArticleService {
    private final ArticleRepository repo;

    ArticleService(ArticleRepository repo) {
        this.repo = repo;
    }

    Page<Article> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    Article save(Article article) {
      article.setCreated(Timestamp.from(Instant.now()));
        return repo.save(article);
    }

    void delete(Long id) {
        repo.deleteById(id);
    }

    Optional<Article> findById(Long id) {
      return repo.findById(id);
    }
}
