package com.rewe.scales.site.article;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name="article")
@NoArgsConstructor
@Data
public class Article {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "created")
    private Timestamp created;

    @Column(name = "weight")
    private Double weight;

    public boolean hasWeight() {
        return weight != null;
    }
}
