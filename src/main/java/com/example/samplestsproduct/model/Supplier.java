package com.example.samplestsproduct.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplierId;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "contactFName")
    private String contactFName;

    @Column(name = "contactLName")
    private String contactLName;

    @Column(name = "contactTitle")
    private String contactTitle;

    @Column(name = "addr1")
    private String addr1;

    @Column(name = "addr2")
    private String addr2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private long zipcode;

    @Column(name = "country")
    private String country;

    @Column(name = "phno")
    private long phno;

    @Column(name = "fax")
    private String fax;

    @Column(name = "url")
    private String url;

    @Column(name = "paymentMethod")
    private String paymentMethod;

    @Column(name = "dicountType")
    private String dicountType;

    @Column(name = "typeGoods")
    private String typeGoods;

    @Column(name = "Notes")
    private String Notes;

    @Column(name = "disAvailable")
    private boolean disAvailable;

    @Column(name = "currentOrder")
    private String currentOrder;

    @Column(name = "logo")
    private String logo;

    @Column(name = "sizeUrl")
    private String sizeUrl;

    @Column(name = "customerId")
    private String customerId;


}
