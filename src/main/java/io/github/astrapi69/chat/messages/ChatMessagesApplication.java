package io.github.astrapi69.chat.messages;

import de.alpharogroup.file.search.PathFinder;
import de.alpharogroup.spring.boot.application.ApplicationHooks;
import io.github.astrapi69.chat.messages.config.ApplicationConfiguration;
import io.github.astrapi69.chat.messages.config.ApplicationProperties;
import io.github.astrapi69.chat.messages.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Import({ ApplicationConfiguration.class, SwaggerConfiguration.class })
@EnableConfigurationProperties({ ApplicationProperties.class })
@SpringBootApplication
public class ChatMessagesApplication
{

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ChatMessagesApplication.class);
		ApplicationHooks.INSTANCE.addDatabaseIfNotExists(application, PathFinder.getSrcMainResourcesDir(),
			"application-dev.yml");
		application.run(args);
	}

}
