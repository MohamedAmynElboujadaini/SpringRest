package com.example.SpringDataRest;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.SpringDataRest.web.VoitureController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
//indique que c’est une classe de test régulier qui exécute les tests à base de Spring boot
class SpringbootReactPart1ApplicationTests {
	@Autowired
	VoitureController voitureController;
	@Test
//indique que cette méthode peut être exécutée comme un cas de test
	void contextLoads() {
		assertThat(voitureController).isNotNull();
	} }