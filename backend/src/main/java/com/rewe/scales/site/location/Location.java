package com.rewe.scales.site.location;

import com.rewe.scales.site.article.Article;
import com.rewe.scales.site.scales.Scale;
import lombok.Builder;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Entity
@Table(name="Location")
public class Location {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "name")
    String name;

    @Column(name = "created")
    Timestamp created;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    Article article;

    @OneToOne(mappedBy = "scale_id")
    Scale scale;
}
