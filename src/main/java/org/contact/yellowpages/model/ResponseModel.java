package org.contact.yellowpages.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.contact.yellowpages.entity.AddressBook;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Getter
public class ResponseModel {

    private List<AddressBook> addressBooks = new ArrayList<>();
}
