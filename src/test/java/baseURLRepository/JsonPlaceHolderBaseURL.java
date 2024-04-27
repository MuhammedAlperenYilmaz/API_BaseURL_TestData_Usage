package baseURLRepository;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class JsonPlaceHolderBaseURL {

    protected RequestSpecification specJsonPlace;

    @BeforeTest
    public void setup() {
        specJsonPlace = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com/posts").
                build();
    }
}
