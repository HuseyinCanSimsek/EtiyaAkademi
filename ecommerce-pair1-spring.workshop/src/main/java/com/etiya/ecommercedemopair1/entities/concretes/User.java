package com.etiya.ecommercedemopair1.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="birth_date")
    private Date birth_date;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="user")
    @JsonBackReference
    private List<Address> addresses;




}
