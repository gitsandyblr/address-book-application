package org.contact.yellowpages.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/addressbook/v1.0")
public class AddressBookController {

    @GetMapping(value = "/getAllEntries")
    public String getAllEntries() {
        return "getAllEntries";
    }
}
