package ${{values.java_package_name}}.greeter;

import org.springframework.stereotype.Service;

@Service
public class GreetingService{

    public $.GreetingDTO getHello(){
        return $.GreetingDTO.builder()
            .greeting("Hello Netsec Team!")
            .build();
    }
}
