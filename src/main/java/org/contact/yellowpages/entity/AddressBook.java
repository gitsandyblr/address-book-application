package org.contact.yellowpages.entity;

import lombok.Getter;

import javax.persistence.*;


@Entity(name = "AddressBook")
@Table(name = "address_book")
@Getter
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String name;

    private String phoneNumber;
}
