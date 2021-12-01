package microfrontend.vaadin.hw.config;

import org.springframework.context.annotation.Configuration;

import com.vaadin.flow.spring.annotation.EnableVaadin;

@Configuration
@EnableVaadin("microfrontend.vaadin.hw.views")
public class VaadinConfig {

}
