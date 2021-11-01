package myfolder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("myfolder")
@PropertySource("musicPlayer.Properties")
public class SpringConfig {

}
