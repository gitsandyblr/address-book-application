package org.contact.yellowpages.controller;

import org.contact.yellowpages.entity.AddressBook;
import org.contact.yellowpages.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/addressbook/v1.0")
public class AddressBookController {

    @Autowired
    AddressBookRepository addressBookRepository;

    @GetMapping(value = "/getAllEntries")
    public String getAllEntries() {
        addressBookRepository.findAll();
        return "getAllEntries";
    }

    @PostMapping(value = "/addEntry", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public AddressBook addEntry(@RequestBody AddressBook addressBook) {
        return addressBookRepository.save(addressBook);
    }
}
