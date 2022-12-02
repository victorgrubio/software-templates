package ${{values.java_package_name}}.greeter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final $.GreetingService greetingService;

    @GetMapping(value = "/hello")
    public $.GreetingDTO getHello() {
        return greetingService.getHello();
    }
}
