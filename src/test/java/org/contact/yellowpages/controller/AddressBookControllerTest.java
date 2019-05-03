package org.contact.yellowpages.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class AddressBookControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    AddressBookController addressBookController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(addressBookController).build();
    }

    @Test
    public void testGetAllEntries() throws Exception{
        mockMvc.perform(
                get("/addressbook/v1.0/getAllEntries")
        ).andExpect(status().isOk());
    }
}
