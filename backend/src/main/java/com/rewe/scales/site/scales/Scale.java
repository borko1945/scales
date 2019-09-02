package com.rewe.scales.site.scales;

import com.rewe.scales.site.location.Location;
import lombok.Builder;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Entity
@Table(name = "scale")
public class Scale {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name="serial_number")
    private String serialNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "created")
    private Timestamp created;

    @OneToOne(mappedBy = "scale")
    Location location;
}
