package com.rewe.scales.site.scales;

import com.rewe.scales.site.location.Location;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Scale {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name="serial_number")
    String serialNumber;

    @Column(name = "name")
    String name;

    @Column(name = "created")
    Timestamp created;

    @OneToOne
    Location location;
}
