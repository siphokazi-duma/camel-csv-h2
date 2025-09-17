package za.co.duma.camelcsv.route;

import za.co.duma.camelcsv.model.Person;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.springframework.stereotype.Component;

@Component
public class CsvRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:src/main/resources?fileName=data.csv&noop=true")
            .unmarshal().bindy(BindyType.Csv, Person.class)
            .split(body())
            .to("bean:personService?method=save");
    }
}
