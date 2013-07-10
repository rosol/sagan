package integration.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.site.web.configuration.ApplicationConfiguration;

@Configuration
@Import({ApplicationConfiguration.class})
public class SiteOfflineConfiguration {

}