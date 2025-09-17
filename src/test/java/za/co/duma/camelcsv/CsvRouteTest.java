package za.co.duma.camelcsv;

import za.co.duma.camelcsv.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CsvRouteTest {

    @Autowired
    private PersonRepository repository;

    @Test
    public void testCsvImport() throws Exception {
        Thread.sleep(2000); // wait for route to complete
        assertEquals(2, repository.count());
    }
}
