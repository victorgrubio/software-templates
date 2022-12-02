package ${{values.java_package_name}}.greeter;

import lombok.Data;
import lombok.Builder;

import java.io.Serializable;

@Data
@Builder
public class GreetingDTO implements Serializable {
  private String greeting;
}
