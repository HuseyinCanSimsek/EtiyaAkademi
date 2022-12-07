package com.etiya.ecommercedemopair1.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="addresses")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="postalcode")
    private int postalCode;

    @Column(name="street")
    private String street;

    @Column(name="title")
    private String title;
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name="user_id",nullable = false)
    @JsonBackReference
    private User user;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="city_id")
    private City city;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="country_id")
    private Country country;

    @OneToMany(mappedBy = "address")
    @JsonIgnoreProperties("Address")
    private List<Order> orders;






}
