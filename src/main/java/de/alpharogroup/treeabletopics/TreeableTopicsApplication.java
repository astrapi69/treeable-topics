package de.alpharogroup.treeabletopics;

import de.alpharogroup.treeabletopics.configuration.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties({ ApplicationProperties.class })
public class TreeableTopicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeableTopicsApplication.class, args);
	}

}
