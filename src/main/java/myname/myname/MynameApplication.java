package myname.myname;

import myname.myname.names_collection.names;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MynameApplication {

    public static void main(String[] args) {
        names.createJsonNames();
//		SpringApplication.run(MynameApplication.class, args);

    }

}
