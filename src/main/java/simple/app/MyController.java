package simple.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class MyController {

    @Get("/hello")
    public String hello() {
        return "hello world";
    }
}
