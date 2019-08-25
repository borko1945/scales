package com.rewe.scales.site.article;

import lombok.Builder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Builder
@Entity
@Table(name="Article")
public class Article {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @NotNull
    @Column(name = "name")
    String name;

    @NotNull
    @Column(name = "created")
    Timestamp created;

    @Column(name = "weight")
    Double weight;

    public boolean hasWeight() {
        return weight != null;
    }
}
