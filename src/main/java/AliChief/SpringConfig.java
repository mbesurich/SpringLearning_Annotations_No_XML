package AliChief;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("AliChief")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
