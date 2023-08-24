package university.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * Entry point to the Spring boot application
 * DO NOT MODIFY THIS CLASS
 */
@SpringBootApplication
public class Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        System.setProperty("spring.devtools.restart.additional-paths", "src/*");
        SpringApplication.run(Application.class, args);
    }
}
