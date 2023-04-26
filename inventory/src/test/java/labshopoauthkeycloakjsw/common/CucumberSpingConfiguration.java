package labshopoauthkeycloakjsw.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopoauthkeycloakjsw.InventoryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventoryApplication.class })
public class CucumberSpingConfiguration {}
