package com.rewe.scales.site.article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleRepository extends JpaRepository<Article, Long> {
}
