package it.weeg.billing.config.initializer;

import it.weeg.billing.config.SpringJpaConfig;
import it.weeg.billing.config.SpringSecurityConfig;
import it.weeg.billing.config.SpringWebConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"it.weeg.billing"})
public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Load database and spring security configuration
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringJpaConfig.class, SpringSecurityConfig.class };
    }

    // Load spring web configuration
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
