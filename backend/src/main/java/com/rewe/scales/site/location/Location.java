package com.rewe.scales.site.location;

import com.rewe.scales.site.article.Article;
import com.rewe.scales.site.scales.Scale;
import lombok.Builder;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Entity
@Table(name="location")
public class Location {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "created")
    private Timestamp created;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    @OneToOne
    @JoinColumn(name="scale_id")
    private Scale scale;
}
