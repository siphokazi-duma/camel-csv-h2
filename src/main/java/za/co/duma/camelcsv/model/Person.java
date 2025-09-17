package za.co.duma.camelcsv.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@CsvRecord(separator = ",", skipFirstLine = true)
public class Person {
    @Id
    @DataField(pos = 1)
    private Long id;

    @DataField(pos = 2)
    private String firstName;

    @DataField(pos = 3)
    private String lastName;

    @DataField(pos = 4)
    private String email;

    // Getters and setters
}
